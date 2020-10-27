package core;

import org.w3c.dom.Node;

public class Logic_compare_node implements Block_node {
    public static Logic_compare_node logic_compare_node_factory(Node node){
        return new Logic_compare_node();
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