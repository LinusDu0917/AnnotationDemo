package com.example.du.annotationdemo.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by linus.du on 12/20/16.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CarInfo {
    public  int id() default -1;
    public  String  brand() default "";
    public  String  name() default "";
}
