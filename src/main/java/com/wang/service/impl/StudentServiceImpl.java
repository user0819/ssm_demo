package com.wang.service.impl;

import com.wang.entity.Student;
import com.wang.mapper.StudentMapper;
import com.wang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiang
 * @since 2020/12/9 11:17
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Student callProcedure(Long id) {
        return studentMapper.callProcedure(id);
    }

    @Override
    public Long callFunction() {
        return studentMapper.callFunction();
    }
}
