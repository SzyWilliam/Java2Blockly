import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void test_parseXMLtoJavaCode(){
        System.out.println(Parser.parseXMLtoJavaCode("./src/main/resources/muti.xml"));
    }

    @Test
    void test_parseTextNode(){
        List<String> res = Parser.parseXMLtoJavaCode("./src/main/resources/text_node.xml");
        System.out.println(res.toString());
        assertEquals(2, res.size());
        assertEquals("abcd", res.get(0));
        assertEquals("efgh", res.get(1));
    }

    @Test
    void test_parseMathNumberNode(){
        List<String> res = Parser.parseXMLtoJavaCode("./src/main/resources/math_number_node.xml");
        assertEquals(3, res.size());
        assertEquals("111", res.get(0));
        assertEquals("222", res.get(1));
        assertEquals("333", res.get(2));
    }

    @Test
    void test_parseMathArithmeticNode(){
        List<String> res = Parser.parseXMLtoJavaCode("./src/main/resources/math_arithmetic_node.xml");
        assertEquals(2, res.size());
        // these two brackets are very important
        assertEquals("(1 + 2)", res.get(0));
        assertEquals("(3 + (4 * 5))", res.get(1));
    }

    @Test
    void test_parseLogicCompareNode(){
        List<String> res = Parser.parseXMLtoJavaCode("./src/main/resources/logic_compare_node.xml");
        assertEquals(2, res.size());
        assertEquals("3 <= 5", res.get(0));
        assertEquals("12 != (3 + 4)", res.get(1));
    }

    @Test
    void test_parseTextPrintNode(){
        List<String> res = Parser.parseXMLtoJavaCode("./src/main/resources/text_print_node.xml");
        assertEquals(2, res.size());
        assertEquals("System.out.println(\"hello world\");\nSystem.out.println(123);\n", res.get(0));
        assertEquals("System.out.println((1 + 2) == 3);\n", res.get(1));
    }
}
