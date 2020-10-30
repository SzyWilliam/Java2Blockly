package core;

import org.w3c.dom.Node;

public class Text_print_node implements Block_node {


    public static Text_print_node text_print_node_factory(Node node){
        String text = node.getChildNodes().item(1).getTextContent();
        //return new Text_node(text);


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
