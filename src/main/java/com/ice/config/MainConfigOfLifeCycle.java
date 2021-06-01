package com.ice.config;

import com.ice.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
 * 2. 通过让 bean 实现 InitializingBean (定义初始化)   DisposableBean(定义销毁)
 *
 * 3. JSR250规范中定义的 @ PostConstruct @ PreDestroy 注解标注在方法上
 *
 * 4. BeanPostProcessor: bean 的后置处理器
 *          bean 初始化前后进行一些处理操作
 *          postProcessBeforeInitialization：在初始化之前工作
 *          postProcessAfterInitialization： 在初始化之后工作
 *
 *
 *
 * @author : Ice-winters
 * @since : 2021-05-31 21:57
 */
@ComponentScan("com.ice.beans") // 这里主要是为了扫描Cat类
@Configuration
public class MainConfigOfLifeCycle {

    /**
     * 初始化 销毁方法
     *
     * @return
     */
    @Scope("singleton")
//    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }


}
