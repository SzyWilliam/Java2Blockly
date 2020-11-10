package translator;

import interfaces.Block;
import interfaces.IMethodToBlock;
import annotation.MethodToBlock;

import java.lang.reflect.Method;

public class MethodToBlockTranslator implements IMethodToBlock {

    @Override
    public Block translateJavaMethodToBlock(Method javaMethod) {
        return null;
    }


    /**
     * This method returns the Annotation@Blockly on a given Java Method
     * @param javaMethod: A Java Method Type
     * @return the @Blockly: Annotation for further extraction
     */
    private MethodToBlock getAnnotatedMethodToBlock(Method javaMethod){
        MethodToBlock[] annotation = javaMethod.getAnnotationsByType(MethodToBlock.class);
        assert annotation.length == 1;
        return annotation[0];
    }
}
