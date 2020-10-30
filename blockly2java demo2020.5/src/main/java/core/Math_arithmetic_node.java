package core;

import org.w3c.dom.Node;

public class Math_arithmetic_node implements Block_node {
    public static Math_arithmetic_node math_arithmetic_node_factory(Node node){
        return new Math_arithmetic_node();
    }

    private Math_number_node node1;


    @Override
    public String toJavaCode() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }
}
