package interfaces.methodBlock;

/**
 * This interface is the representation of a single Blockly.Block.Argument
 *
 * It simply contains three elements
 *  type: block type
 *  name: parameter name
 *  check: parameter type
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */
public interface MethodBlockArg {
    public String getType();
    public String getName();
    public String getCheck();
}