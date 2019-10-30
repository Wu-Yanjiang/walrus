package com.wyj.cloud.person.entity;

import lombok.Data;

/**
 * @Description:
 * @Author: Jungle.Wu
 * @Date: 2019/10/29
 * @email: wuyj_prom@si-tech.com.cn
 */
@Data
public class Person {
    String name;
    String age;

    public Person(String persopnName) {
        this.name = persopnName;
    }
}
