package com.kangxu.device.service;

import com.kangxu.device.vo.RequestObject;
import com.kangxu.device.vo.ResponseObject2;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TDevInfoServiceTest {

    @Autowired
    private TDevInfoService infoService;

    @Test
    public void setVersion() {
        RequestObject requestObject = new RequestObject();
        requestObject.setDevno("2002");
        requestObject.setDevtype("C0000201");
        requestObject.setVersion("1.6.7");
        Boolean aBoolean = infoService.SetVersion(requestObject);
        System.out.println(aBoolean);
    }


    @Test
    public void getDevno() {
        RequestObject requestObject = new RequestObject();
        requestObject.setOrgid("43");
        requestObject.setDevtype("C0000202");

        List<ResponseObject2> devnos = infoService.getDevnos(requestObject);
        for (ResponseObject2 df : devnos){
            System.out.println("设备号：" + df.getDevno());
        }
    }


}
