package com.kangxu.device.controller;

import com.kangxu.device.mapper.UserMapper;
import com.kangxu.device.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.List;

/**
 * @author: zxx
 * @create: 2020-04-14 22:12
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/findAll11",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> all = userMapper.findAll();
        log.info("数据" ,all);
        System.out.println(all);
        return all;
    }


    @RequestMapping(value = "/findId",method = RequestMethod.POST)
    public User findById(@RequestParam(value = "id") String id, HttpServletRequest request, HttpServletResponse response){
        String requestURI = request.getRequestURI();
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headName = (String)headerNames.nextElement();
            String headValue = request.getHeader(headName);
            System.out.println(headName+"："+headValue);
        }
        response.addHeader("sing","455555555555555555");
        response.addHeader("app","123");

        String sing = response.getHeader("sing");
        String app = response.getHeader("app");
        System.out.println("--------------------START------------------"+sing);
        System.out.println("--------------------START------------------"+app);
        return userMapper.getUser(id);
    }


}
