import core.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List<String> parseXMLtoJavaCode(String xmlFilePath){
        List<String> res = new ArrayList<String>();

        Node root = getXMLRootNode(xmlFilePath);
        // invalid format
        if(root == null){ return res; }

        NodeList nodeList = root.getChildNodes();
        int childNum;
        // there is no child node
        if(nodeList == null || (childNum = nodeList.getLength()) == 0){ return res; }

        for(int i = 1; i <= childNum - 2; i += 2){
            Node currChild = nodeList.item(i);
            res.add(parseNodeToJavaCode(currChild)); // parse each node to java code and add to res list
        }
        return res;
    }

    private static String parseNodeToJavaCode(Node node){
        String type = node.getAttributes().getNamedItem("type").getTextContent();
        String res;
        // reflection should be used to replace this switch
        switch(type){
            case "text":
                res = Text_node.text_node_factory(node).toJavaCode();
                break;
            case "math_number":
                res = Math_number_node.math_number_node_factory(node).toJavaCode();
                break;
            case "math_arithmetic":
                res = Math_arithmetic_node.math_arithmetic_node_factory(node).toJavaCode();
                break;
            case "logic_compare":
                res = Logic_compare_node.logic_compare_node_factory(node).toJavaCode();
                break;
            case "text_print":
                res = Text_print_node.text_print_node_factory(node).toJavaCode();
                break;
            default:
                System.out.println("unknown type");
                res = "UNKNOWN";
        }
        return res;
    }


    /*
    * get the xml root node of a certain xml file, return null if failed
    * */
    private static Node getXMLRootNode(String xmlFilePath){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = null;
        Document document = null;
        try{
            builder = documentBuilderFactory.newDocumentBuilder();
            document = builder.parse(xmlFilePath);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        Node node = null;
        if(document != null){
            NodeList nodeList = document.getElementsByTagName("xml");
            if(nodeList != null && nodeList.getLength() == 1){
                node = nodeList.item(0);
            }
        }

        return node;
    }

}
