package com.kangxu.consumer.controller;

import com.kangxu.consumer.service.UserService;
import com.kangxu.device.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zxx
 * @create: 2020-04-14 22:30
 **/
@RestController
@RequestMapping(value = "/kangxu")
public class UserConsumerController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }
    @RequestMapping(value = "/findId",method = RequestMethod.GET)
    public User findAll(@RequestParam(value = "id") String id){
        return userService.findById(id);
    }
}
