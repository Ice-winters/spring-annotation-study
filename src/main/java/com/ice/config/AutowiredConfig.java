package com.ice.config;

import com.ice.beans.Boss;
import com.ice.beans.Car;
import com.ice.beans.CarImportSelector;
import com.ice.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Autowired 在容器中先按照类型注入，若发现此类型有多个实例，则按照名称注入  如 personDao1 personDao2
 *      可以搭配 @Qualifier("personDao1") 注解， 来指定实例的名称注入容器
 *
 * 注解 @Resource 为JSR250规范中的注解
 *
 *
 * 自定义组件怎么引入 Spring 底层的组件呢
 *      让自定义组件实现XxxAware接口即可
 *
 * @author : Ice-winters
 * @since : 2021-06-01 09:33
 */
@Configuration
@ComponentScan(value = {"com.ice.dao","com.ice.service"})
@Import(CarImportSelector.class)

public class AutowiredConfig {


    /**
     * 这里的 @Autowired 可以省略，因为只有一个参数，默认从容器中获取的
     */
    @Bean
    public Boss boss(@Autowired(required = false) Car car) {
        Boss boss = new Boss();
        boss.setCar(car);
        //System.out.println("car = " + car);
        return boss;
    }



    @Bean("personDao2")
    public PersonDao personDao2 (){
        PersonDao personDao = new PersonDao();
        personDao.setLabel("2");
        return personDao;
    }


}
