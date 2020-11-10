package interfaces.translator;

import interfaces.methodBlock.MethodBlock;

import java.io.OutputStream;

public interface IJavaSourceToBlockly {
    public void generateBlockDefinitionsForClass(Class<?> targetJavaSourceClass, OutputStream out);
}
