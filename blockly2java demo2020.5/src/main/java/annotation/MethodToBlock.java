package annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This Annotation maps *Java.Method* to *Blockly.Block*
 * A Method contains ReturnType, ArgumentList, MethodName and MethodBody
 *
 * Map rules:
 *      Java.Method.ReturnType -> Blockly.Block.output
 *      Java.Method.parameters -> Blockly.Block.args
 *      Java.Method.methodName(raw) -> Blockly.Block.DumbField
 *      Java.Method.methodName(use) -> Blockly.Block.BlockType
 *
 * Annotation Usage:
 * @MethodToBlock (belongClass = CLASS, returnType=Integer.class, arguments=[Integer.class, String.class], methodName="method name")
 * Integer demoMethod(Integer i, String s) {...}
 *
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodToBlock {
    Class<?> belongClass();
    Class<?> returnType();
    Class<?>[] arguments();
    String methodName();
}
