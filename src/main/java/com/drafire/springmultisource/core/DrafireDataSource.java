package com.drafire.springmultisource.core;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DrafireDataSource {
    String value() default "";
}
