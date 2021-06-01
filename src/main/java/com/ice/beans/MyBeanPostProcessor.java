package com.ice.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 后置处理器， 初始化前后进行处理(所有需要注入spring容器中的都会经过这个后置处理器，有点像过滤器那种形式)
 * 将后置处理器加入容器中，spring就可以让其进行工作
 *
 * @author : Ice-winters
 * @since : 2021-05-31 23:37
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    private final ConfigurableApplicationContext applicationContext;


    // 这里是构造注入？
    public MyBeanPostProcessor(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * @param bean 前初始化的bean
     * @param beanName 前初始化的beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName +"=>" + bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName +"=>" + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
