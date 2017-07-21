package com.oversea.task.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author fengjian
 * @version V1.0
 * @title: oversea
 * @Package com.oversea.task.domain
 * @Description:
 * @date 16/8/1
 */
@Target({TYPE, FIELD})
@Retention(RUNTIME)
public @interface NotNull {
}
