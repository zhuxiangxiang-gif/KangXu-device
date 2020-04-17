package com.kangxu.device.controller;

import com.kangxu.device.vo.*;
import com.kangxu.device.vo.useless.Test;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zxx
 * @create: 2020-04-15 21:23
 * http://localhost:8080/kangxu/v1/device/set/version
 **/
@RestController
@RequestMapping("/kangxu/v1/device/set/")
public class TestController {
    @PostMapping("/version")
    public Object insertPosition (@RequestBody Test test) {
        HeaderObject header = test.getHeader();
        RequestObject requestObject = test.getRequest();
        header.setAppid("1");
        header.setChannel("2");
        header.setSgin("3");
        header.setTimestamp("4");
        header.setTradcode("5");
        ResponseObject2 responseObject2 = new ResponseObject2();
        responseObject2.setRetcode("true");
        responseObject2.setRetdesc("成功");
        ResponseObject responseObject = new ResponseObject();
        responseObject.setHeader(header);
        responseObject.setResponse(responseObject2);
        return responseObject;
    }
    @PostMapping("/status")
    public Object insertStatus () {
        return "";
    }
    @PostMapping("/devnos")
    public Object insertDevnos () {
        return "";
    }

}
