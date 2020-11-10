package interfaces.translator;

import interfaces.methodBlock.MethodBlock;

import java.lang.reflect.Method;

/**
 * This interface is use to translate a given java method to a @interface Block
 * it receives a java method (Type java.reflection.Method)
 * and produces a Block (Type interfaces.Block)
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */
public interface IMethodToBlock {
    public MethodBlock translateJavaMethodToBlock(Method javaMethod);
}
