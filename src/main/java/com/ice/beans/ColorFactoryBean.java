package com.ice.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * 创建一个spring定义的FactoryBean
 * 一般在其他框架与spring的整合时候用的较多
 *
 * 默认获取的是工厂bean调用getObject() 创建的对象
 * 要回去工厂bean本身， 需要在id前面加上 & 符号
 * Object bean = applicationContext.getBean("&colorFactoryBean"); 获取的就是ColorFactoryBean对象
 *
 * @author : Ice-winters
 * @since : 2021-05-31 21:22
 */
public class ColorFactoryBean implements FactoryBean<Color> {


    /**
     * 返回一个Color对象，这个对象会添加到容器中
     */
    @Override
    public Color getObject() throws Exception {
        System.out.println("调用ColorFactoryBean 创建 Color对象");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否单例 true: 是
     * false 多例， 每次创建都会调用getObject
     * @return
     */
    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
        return false;
    }
}
