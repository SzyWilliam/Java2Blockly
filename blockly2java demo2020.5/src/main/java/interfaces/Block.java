package interfaces;

import java.util.List;

/**
 * This interface Block is the Medium Representation of A Blockly.Block
 * It contains the essential elements to generate a corresponding Block Javascript/JSON declaration
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */
public interface Block {
    public String getBlockType();
    public String getBlockCode();
    public String getOutputType();
    public List<String> getArguments();
}
