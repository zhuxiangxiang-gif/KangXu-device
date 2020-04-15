package com.kangxu.consumer.service;

import com.kangxu.device.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="device-provider")
public interface UserService {

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll();

    @RequestMapping(value = "/findId",method = RequestMethod.GET)
    public User findById(@RequestParam(value = "id") String id);
}
