package com.ice.beans;

import org.springframework.stereotype.Component;

/**
 * @author : Ice-winters
 * @since : 2021-05-31 22:03
 */
@Component
public class Car {

    public Car() {
        System.out.println("Car constructor...");
    }

    public void init() {
        System.out.println("car ... init ... ");
    }

    public void destroy() {
        System.out.println("car ... destroy ...");
    }

}
