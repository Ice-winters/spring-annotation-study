package com.ice;

import com.ice.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ice-winters
 * @since : 2021-05-31 22:07
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        System.out.println("容器初始化完成。。。");


        applicationContext.close();



    }
}
