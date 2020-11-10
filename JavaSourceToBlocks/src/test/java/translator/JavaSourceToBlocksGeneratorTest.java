package translator;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class JavaSourceToBlocksGeneratorTest {

    @Test
    public void GeneratorTest() throws ClassNotFoundException, FileNotFoundException {
        JavaSourceToBlocksGenerator generator = new JavaSourceToBlocksGenerator();
        generator.generateBlockDefinitionsForClass(Class.forName("java.lang.String"), new FileOutputStream("./result.txt"));
    }
}