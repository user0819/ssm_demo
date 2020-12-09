package com.wang.controller;

import com.wang.entity.Student;
import com.wang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiang
 * @since 2020/12/9 9:40
 */
@RestController
public class MyController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/test")
    public String test() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable Long id) {
        return studentService.selectByPrimaryKey(id);
    }

    @GetMapping("/getProc/{id}")
    public Student getProc(@PathVariable Long id) {
        return studentService.callProcedure(id);
    }


    @GetMapping("/getFunction")
    public Long getFunction() {
        return studentService.callFunction();
    }
}
