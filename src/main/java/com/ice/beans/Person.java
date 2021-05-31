package com.ice.beans;

import com.ice.anno.TestIce;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author : Ice-winters
 * @since : 2021-05-28 08:58
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@TestIce
public class Person {

    private String name;
    private Integer age;


    public void initPerson() {}

    public void destroyPerson() {}
}
