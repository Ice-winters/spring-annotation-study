package com.ice;

import com.ice.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Ice-winters
 * @since : 2021-05-28 09:01
 */

public class MainClass {

    public static void main(String[] args) {

//        createXml();

        annotation();


    }

    private static void annotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ice.config");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            //System.out.println("name = " + name);
        }
        Person bean = applicationContext.getBean(Person.class);
        System.out.println("bean = " + bean);
        ;
    }

    private static void createXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Person person = (Person) applicationContext.getBean(Person.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("name = " + name);
        }
        System.out.println(person);
    }
}
