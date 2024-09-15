package com.yond.common.annotation;

import com.yond.common.enums.VisitBehavior;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 用于需要记录访客访问日志的方法
 * @Author: Yond
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VisitLogger {
    /**
     * 访问行为枚举
     */
    VisitBehavior value() default VisitBehavior.UNKNOWN;
}
