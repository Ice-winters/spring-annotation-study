package com.ice.beans;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 12:41
 */
public class Boss {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
