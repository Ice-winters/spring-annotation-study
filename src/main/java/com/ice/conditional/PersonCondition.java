package com.ice.conditional;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : Ice-winters
 * @since : 2021-05-29 11:39
 */
public class PersonCondition  implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        BeanDefinitionRegistry registry = context.getRegistry();
        // 当容器中是否存在personId的对象
        boolean definition = registry.containsBeanDefinition("personId");
        return definition;
    }
}
