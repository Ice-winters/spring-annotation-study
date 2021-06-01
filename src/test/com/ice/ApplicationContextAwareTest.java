package com.ice;

import com.ice.beans.MyApplicationContext;
import com.ice.config.ApplicationContextConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 14:57
 */
public class ApplicationContextAwareTest {



    @Test
    public void test01() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        MyApplicationContext bean = annotationConfigApplicationContext.getBean(MyApplicationContext.class);

        ApplicationContext applicationContext = bean.getApplicationContext();

    }

}
