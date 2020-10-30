package core;

import org.w3c.dom.Node;

public class Math_number_node implements Block_node {
    private final int number;

    public Math_number_node(int number) {
        this.number = number;
    }

    public static Math_number_node math_number_node_factory(Node node) {
        int number = Integer.parseInt(node.getChildNodes().item(1).getTextContent());
        return new Math_number_node(number);
    }

    @Override
    public String toJavaCode() {
        return number + "";
    }

    @Override
    public String toXML() {
        return "<block type=\"math_number\" id=\"\" x=\"\" y=\"\">" +
                "<field name=\"NUM\">" + number + "</field>" +
                "</block>";
    }
}
