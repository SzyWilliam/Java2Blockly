package interfaces.translator;

import interfaces.methodBlock.MethodBlock;

import java.io.OutputStream;

public interface IMethodBlockToJS {
    public void translateMethodBlockToJS(MethodBlock target, OutputStream out);
}
