package core;

import org.w3c.dom.Node;

public class Text_node implements Block_node {

    private String text;

    public Text_node(String text) {
        this.text = text;
    }

    public static Text_node text_node_factory(Node node) {
        String text = node.getChildNodes().item(1).getTextContent();
        return new Text_node(text);
    }

    @Override
    public String toJavaCode() {
        return text;
    }

    @Override
    public String toXML() {
        return "<block type=\"text\" id=\"\" x=\"\" y=\"\">" +
                "<field name=\"TEXT\">" + text + "</field>" +
                "</block>";
    }
}
