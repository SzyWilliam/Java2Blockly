package translator;

import interfaces.Block;
import interfaces.IClassToBlockly;

import java.lang.reflect.Method;
import java.util.Map;

public class ClassToBlocklyTranslator implements IClassToBlockly {
    @Override
    public Map<Method, Block> translateClassToBlocklyWorkspace(Class<?> targetClass) {
        return null;
    }
}
