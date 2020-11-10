package translator;

import interfaces.methodBlock.MethodBlock;
import interfaces.translator.IClassToBlocks;

import java.lang.reflect.Method;
import java.util.Map;

public class ClassToBlocklyTranslator implements IClassToBlocks {
    @Override
    public Map<Method, MethodBlock> translateClassToBlocklyWorkspace(Class<?> targetClass) {
        return null;
    }
}
