package com.ice.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断是否为windows系统
 * @author : Ice-winters
 * @since : 2021-05-29 01:28
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");

        if (property.toLowerCase().contains("linux")) {
            return true;
        }
        return false;
    }
}
