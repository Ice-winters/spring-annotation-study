package com.ice.config;

import com.ice.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * bean 的生命周期
 *      bean 创建 ---> 初始化 ---> 销毁
 *
 * 我们可以自定义  初始化  和  销毁
 * 1. 指定初始化和销毁方法
 *          xml 配置中 init-method="initPerson" destroy-method="destroyPerson"
 *          @ Bean(initMethod = "init", destroyMethod = "destroy")
 *      注意 ：  @Scope("prototype") 配置为多实例时候， init方法只有在调用获取实例收才进行执行创建对象并且初始化，
 *          多实例的容器关闭不会进行bean的销毁方法执行
 *
 *
 *
 *
 *
 * @author : Ice-winters
 * @since : 2021-05-31 21:57
 */
@Configuration
public class MainConfigOfLifeCycle {

    /**
     * 初始化 销毁方法
     *
     * @return
     */
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }


}
