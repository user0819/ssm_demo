package com.wang.service;

import com.wang.entity.Student;

/**
 * @author wangxiang
 * @since 2020/12/9 11:16
 */
public interface IStudentService {
    Student selectByPrimaryKey(Long id);

    Student callProcedure(Long id);

    Long callFunction();
}
