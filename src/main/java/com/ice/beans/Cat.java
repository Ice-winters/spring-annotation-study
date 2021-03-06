package com.ice.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author : Ice-winters
 * @since : 2021-05-31 22:45
 */
@Component
public class Cat implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("cat .. destroy ...");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("cat .. afterPropertiesSet ...");

    }
}
