package interfaces.methodBlock;
import java.util.List;
import java.util.Map;

/**
 * This interface is the representation of a single Blockly.Block
 *
 * It contains all the definitions and configurations to generate a Block definition (In JS or In JSON)
 * All the methods could return a empty String when the corresponding field is not configured.
 *
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */
public interface MethodBlock {
    public String getType();
    public String getMessage();
    public String getOutput();
    public List<MethodBlockArg> getArgs();
    public Integer getColor();
    public String getTooltip();
    public String getHelpUrl();
    public String getPreviousStatement();
    public String getNextStatement();
    public Boolean getInputsInline();
}
