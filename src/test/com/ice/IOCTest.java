package com.ice;

import com.ice.beans.Blue;
import com.ice.beans.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author : Ice-winters
 * @since : 2021-05-29 01:07
 */
public class IOCTest {


    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ice.config");



    @Test
    public void test03() {
        sout();

        System.out.println("===============");
        // 工厂bean获取的是调用getObject()创建的对象
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("colorFactoryBean");
        // 单例为true 多例为false,多例每次获取对象都会调用getObject()方法
        System.out.println(colorFactoryBean == colorFactoryBean2);

        System.out.println("bean 类型：" +  colorFactoryBean.getClass());


        Object bean = applicationContext.getBean("&colorFactoryBean");
        System.out.println("想要获取 ColorFactoryBean 本身 要加 & : " + bean.getClass().getName());


    }


    @Test
    public void test02() {
        sout();

        Blue blue = applicationContext.getBean(Blue.class);
        Blue blue1 = applicationContext.getBean(Blue.class);
        System.out.println(blue);
        System.out.println(blue1);

        System.out.println(blue == blue1);
    }


    private void sout(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + s);
        }
    }

    @Test
    public void test01(){

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : namesForType) {
            System.out.println("s = " + s);
        }
        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);

        Environment environment = applicationContext.getEnvironment();

        // 获取环境变量的值Windows 8.1
        String property = environment.getProperty("os.name");
        System.out.println("property = " + property);
    }
}
