package core;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import parserTool.Parser;

import java.util.HashSet;
import java.util.Set;

public class Math_arithmetic_node implements Block_node {
    private Block_node val_A;
    private Block_node val_B;
    private String op;

    private Math_arithmetic_node(Block_node val_A, Block_node val_B, String op) {
        this.val_A = val_A;
        this.val_B = val_B;
        this.op = op;
    }

    public static Math_arithmetic_node math_arithmetic_node_factory(Node node) {
        Set<String> validTypeSet = new HashSet<>();
        validTypeSet.add("math_number");
        validTypeSet.add("math_arithmetic");

        NodeList nodeList = node.getChildNodes();
        int nodeNum = nodeList.getLength();

        String op = nodeList.item(1).getTextContent(); // 待解析运算符

        if (nodeNum == 2) { // 只有运算符
            return new Math_arithmetic_node(null, null, op);
        } else if (nodeNum == 4) { // 有一个操作数
            Node currChild = nodeList.item(3);
            String type = currChild.getAttributes().getNamedItem("name").getTextContent();
            if (type.equals("A")) { // 左操作数
                return new Math_arithmetic_node(Parser.parseNodeToBlockNode(currChild.getChildNodes().item(1), validTypeSet), null, op);
            } else { // 右操作数
                return new Math_arithmetic_node(null, Parser.parseNodeToBlockNode(currChild.getChildNodes().item(1), validTypeSet), op);
            }
        } else { // 两个操作数
            Node val_A = nodeList.item(3).getChildNodes().item(1);
            Node val_B = nodeList.item(5).getChildNodes().item(1);
            return new Math_arithmetic_node(Parser.parseNodeToBlockNode(val_A, validTypeSet), Parser.parseNodeToBlockNode(val_B, validTypeSet), op);
        }
    }


    @Override
    public String toJavaCode() {
        String opToJava = "";
        String a = " ";
        String b = " ";

        if (val_A != null) {
            a = val_A.toJavaCode();
        }
        if (val_B != null) {
            b = val_B.toJavaCode();
        }

        switch (op) {
            case "ADD":
                opToJava = "(" + a + "+" + b + ")";
                break;
            case "MINUS":
                opToJava = "(" + a + "-" + b + ")";
                break;
            case "MULTIPLY":
                opToJava = "(" + a + "*" + b + ")";
                break;
            case "DIVIDE":
                opToJava = "(" + a + "/" + b + ")";
                break;
            case "POWER":
                opToJava = "Math.pow(" + a + ", " + b + ")";
                break;
        }
        return opToJava;
    }

    @Override
    public String toXML() {
        String a = val_A.toXML();
        String b = val_B.toXML();
        return "<block type=\"math_arithmetic\" id=\"\" x=\"\" y=\"\">" +
                "<field name=\"OP\">" + op + "</field>" +
                "<value name=\"A\">" + a + "</value>" +
                "<value name=\"B\">" + b + "</value>" +
                "</block>";
    }
}
