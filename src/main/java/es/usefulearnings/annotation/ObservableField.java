package es.usefulearnings.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation that need to be used at entities to
 * set the name that will be shown in the gui package.
 *
 * @author yago on 9/09/16.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ObservableField {
  /**
   * @return the desired name to be shown
   */
  String name();

  /**
   * @return the field type {@link FieldType}
   */
  FieldType fieldType() default FieldType.STRING;
}