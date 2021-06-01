package com.ice;

import com.ice.beans.Boss;
import com.ice.beans.Car;
import com.ice.config.AutowiredConfig;
import com.ice.dao.PersonDao;
import com.ice.service.PersonService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 09:31
 */
public class IOCTest_Autowired {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);


    @Test
    public void test02() {
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println("boss = " + boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println("car = " + car);

    }


    @Test
    public void test01() {

        PersonDao personDao1 = (PersonDao) applicationContext.getBean("personDao1");
        PersonDao personDao2 = (PersonDao) applicationContext.getBean("personDao2");
        System.out.println("personDao1 = " + personDao1 +" = " + personDao1.getLabel());
        System.out.println("personDao2 = " + personDao2 +" = " + personDao2.getLabel());

        PersonService personService = (PersonService) applicationContext.getBean("personService");

        System.out.println(personService);

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = "+  beanDefinitionName);
        }

    }


}
