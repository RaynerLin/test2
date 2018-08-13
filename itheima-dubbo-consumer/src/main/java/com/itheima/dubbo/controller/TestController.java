package com.itheima.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.dubbo.controller
 */
@Controller
public class TestController {

//    @Autowired
    @Reference
    private TestService testService;

    @RequestMapping("/sayhello")
    @ResponseBody
    public String sayHello(){
        return testService.sayhello();
    }

}
