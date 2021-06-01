package com.ice.dao;

import org.springframework.stereotype.Repository;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 09:30
 */
@Repository("personDao1")
public class PersonDao {


    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }



}
