package com.kangxu.device.mapper;

import com.kangxu.device.pojo.TDevInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TDevInfoMapperTest {

    @Autowired
    private TDevInfoMapper tDevInfoMapper;

    @Test
    public void findAll() {
        List<TDevInfo> all = tDevInfoMapper.findAll();
        for (TDevInfo list : all){
            System.out.println("所有数据+" + list);
        }
    }


}
