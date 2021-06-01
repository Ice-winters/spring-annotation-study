package com.ice.service;

import com.ice.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 09:31
 */
@Service
public class PersonService {


//    @Autowired
//    @Qualifier("personDao1")
//    private PersonDao personDao1;
    @Resource
    private PersonDao  personDao2;


    @Override
    public String toString() {
        return "PersonService{" +
                "personDao=" +personDao2 +
                '}';
    }
}
