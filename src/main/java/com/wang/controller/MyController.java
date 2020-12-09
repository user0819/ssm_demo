package com.wang.controller;

import com.wang.entity.WfeProcInstTaskNodeHistory;
import com.wang.mapper.WfeProcInstTaskNodeHistoryMapper;
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
    private WfeProcInstTaskNodeHistoryMapper wfeProcInstTaskNodeHistoryMapper;

    @GetMapping("/test")
    public String test(){
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/get/{id}")
    public WfeProcInstTaskNodeHistory get(@PathVariable Long id){
        return wfeProcInstTaskNodeHistoryMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/getProc/{id}")
    public WfeProcInstTaskNodeHistory getProc(@PathVariable Long id){
        return wfeProcInstTaskNodeHistoryMapper.callProcedure(id);
    }


    @GetMapping("/getFunction")
    public Long getFunction(){
        return wfeProcInstTaskNodeHistoryMapper.callFunction();
    }
}
