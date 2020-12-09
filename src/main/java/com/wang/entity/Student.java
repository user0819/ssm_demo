package com.wang.entity;

import lombok.Data;

/*
CREATE TABLE `student` (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `age` int(11) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
*/
@Data
public class Student {
    private Long id;

    private String name;

    private Integer age;
}