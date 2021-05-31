package com.ice.conditional;

import com.ice.beans.Blue;
import com.ice.beans.Rainbow;
import com.ice.beans.Red;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : Ice-winters
 * @since : 2021-05-30 19:01
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * importingClassMetadata 当前类注解信息
     * BeanDefinitionRegistry  BeanDefinition 注册类
     *                  把所有需要添加到容器中的bean 调用
     *                  BeanDefinitionRegistry#registerBeanDefinition 手工注册进入容器
     *
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        // 注册com.ice.beans.Rainbow
        boolean blue = registry.containsBeanDefinition(Blue.class.getName());
        boolean red = registry.containsBeanDefinition(Red.class.getName());

        if (blue && red) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow-ice",beanDefinition);
        }


    }


}
