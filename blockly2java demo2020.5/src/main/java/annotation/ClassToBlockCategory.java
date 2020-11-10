package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This Annotation maps a *Java Class* to a series of *Blockly Blocks* and formed the Block Category
 * The map rules are stated in the document
 *
 * @author Song ZiYang
 * @version 1.0
 * @since 2020.11.10
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassToBlockCategory {
    String BlockCategoryNamespace();
}
