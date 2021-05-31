package com.ice.config;

import com.ice.beans.Color;
import com.ice.beans.ColorFactoryBean;
import com.ice.beans.Red;
import com.ice.conditional.ComponentImportSelector;
import com.ice.conditional.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import 要导入容器中的组件，容器就会自动注册这个组件， id默认为全类名
 * ImportSelector 导入选择器：返回需要导入的组件的犬类的全类名数组
 * ImportBeanDefinitionRegistrar:   把所有需要添加到容器中的bean 调用 BeanDefinitionRegistry#registerBeanDefinition 手工注册进入容器
 *
 *
 * @author : Ice-winters
 * @since : 2021-05-29 18:00
 */
// 快速导入组件，id默认为组件全类名
@Configuration

@Import(value = {Color.class, Red.class, ComponentImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class WebConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }

}
