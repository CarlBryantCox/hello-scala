package com.chw.test.controller;


import com.alibaba.fastjson.JSON;
import com.chw.test.dto.TeacherDTO;
import com.chw.test.entity.User;
import com.chw.test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author CarlBryant
 * @since 2020-08-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getById(1);
    }

    @GetMapping("/getUserByScala")
    public User getUserByScala(){
        return userService.getUserByScala();
    }

    @GetMapping("/newTeacher")
    public TeacherDTO newTeacher(){
        TeacherDTO nancy = new TeacherDTO(2, "Nancy");
        System.out.println("nancy.id()="+nancy.id());
        System.out.println("nancy.teacherName()="+nancy.teacherName());
        return nancy;
    }

}
