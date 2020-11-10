package interfaces;


import java.lang.reflect.Method;
import java.util.Map;

/**
 * This interface translates a given class (usually shipped in a .java file) to a list of blocks
 * it will return a map<method, block> containing the translated mappings
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */
public interface IClassToBlockly {
    public Map<Method, Block> translateClassToBlocklyWorkspace(Class<?> targetClass);
}
