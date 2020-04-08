package com.example.swagger_ui.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tian
 * @version 1.0.0
 * @ClassName TestController.java
 * @createTime 2020年04月08日 13:15
 **/
@Api("用户接口")
@RestController
@RequestMapping("user")
public class TestController {
    @ApiOperation(value = "添加用户")
    @PostMapping("add")
    public void addUser(
        @ApiParam(value = "用户名",required = true)
                @RequestParam(defaultValue = "张三") String nickname,
        @ApiParam(value = "用户年龄") @RequestParam(defaultValue = "14") String age){
        System.out.println("nickname = " + nickname);
        System.out.println("age = " + age);
    }
}
