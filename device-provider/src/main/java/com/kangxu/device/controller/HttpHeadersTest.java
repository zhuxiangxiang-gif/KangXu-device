package com.kangxu.device.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zxx
 * @create: 2020-04-15 17:29
 **/
@RestController
public class HttpHeadersTest {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {


        return "9999999999";
    }
}

