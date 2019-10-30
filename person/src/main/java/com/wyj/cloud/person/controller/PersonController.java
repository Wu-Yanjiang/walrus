package com.wyj.cloud.person.controller;

import com.wyj.cloud.person.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Jungle.Wu
 * @Date: 2019/10/29
 * @email: wuyj_prom@si-tech.com.cn
 */
@Controller
public class PersonController {

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String persopnName) {
        Person person = new Person(persopnName);
        List<Person> people = new ArrayList<>();
        people.add(person);
        return people;
    }
}
