package com.ice.config;

import com.ice.beans.Person;
import com.ice.conditional.LinuxCondition;
import com.ice.conditional.PersonCondition;
import com.ice.conditional.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author : Ice-winters
 * @since : 2021-05-28 09:08
 */
@Conditional(WindowsCondition.class) // 当前类中组件统一设置： 满足条件，这个类中的所有的bean配置才会生效
@Configuration
@ComponentScans(value = {@ComponentScan(value = "com.ice.beans",includeFilters = {
        /*@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = Person.class),
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)*/
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)

}, useDefaultFilters = false)})

public class BeanConfiguration {

    @Bean("personId")
    @Scope("singleton")// singleton  prototype
    @Lazy
    public Person getPerson() {
        return new Person("zhc", 28);
    }


    /**
     *  @ conditional, 按照一定条件进行判断， 满足条件给容器中注册bean
     * 如果操作系统是windows系统，给容器中注册 myf  如果linux注册ice
     *
     *
     * @return
     */
    @Bean("myf")
    @Conditional(WindowsCondition.class)
    public Person person01 () {
        return new Person("myf",29);
    }

    @Bean("ice")
    @Conditional(value = LinuxCondition.class) // 多个注解表示 and  并非 or
    public Person person02 () {
        return new Person("ice",29);
    }

    @Bean("personId2")
    @Conditional(value = PersonCondition.class)
    public Person personId2 () {
        return new Person("ice",29);
    }


}
