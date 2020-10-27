package core;

import org.w3c.dom.Node;

public class Math_number_node implements Block_node {
    public static Math_number_node math_number_node_factory(Node node){
        return new Math_number_node();
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
