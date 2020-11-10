package translator;

import annotation.BlockConfig;
import interfaces.methodBlock.MethodBlock;
import interfaces.translator.IMethodToBlock;

import java.lang.reflect.Method;

public class MethodToBlockTranslator implements IMethodToBlock {

    @Override
    public MethodBlock translateJavaMethodToBlock(Method javaMethod) {
        return null;
    }


    /**
     * This method returns the Annotation@Blockly on a given Java Method
     * @param javaMethod: A Java Method Type
     * @return the @Blockly: Annotation for further extraction
     */
    private BlockConfig getMethodBlockConfig(Method javaMethod){
        BlockConfig[] annotation = javaMethod.getAnnotationsByType(BlockConfig.class);
        assert annotation.length == 1;
        return annotation[0];
    }
}
