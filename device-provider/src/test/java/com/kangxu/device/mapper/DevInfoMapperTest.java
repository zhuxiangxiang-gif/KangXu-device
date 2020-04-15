package com.kangxu.device.mapper;

import com.kangxu.device.pojo.DevInfo;
import org.bouncycastle.asn1.DERVideotexString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.Assert.*;
@SpringBootTest
//@RunWith()
public class DevInfoMapperTest {

    private DevInfoMapper devInfoMapper;
    @Test
    public void insert() {
        DevInfo devInfo = new DevInfo();
        devInfo.setDeleted(true);
        devInfo.setDiDevNo("666666");
        devInfo.setDiDepartId("123321");
        devInfo.setDiDevNo("4621");
        devInfo.setDiStatus("0");
        devInfoMapper.insert(devInfo);
    }


}
