package core;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import parserTool.Parser;

public class Text_print_node implements Block_node {
    //List<>


    public Text_print_node() {

    }

    public static Text_print_node text_print_node_factory(Node node) {
        NodeList nodeList = node.getChildNodes();

        int childNum;
        // there is no child node
        if (nodeList == null || (childNum = nodeList.getLength()) == 0) {
            return null;
        }

        for (int i = 1; i <= childNum - 2; i += 2) {
            Node currChild = nodeList.item(i);
            Parser.parseNodeToBlockNode(currChild, null).toJavaCode(); // parse each node to java code and add to res list
        }

        return new Text_print_node();
    }

    @Override
    public String toJavaCode() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }
}
