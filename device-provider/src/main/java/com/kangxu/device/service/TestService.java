package com.kangxu.device.service;

import com.kangxu.device.mapper.DevInfoMapper;
import com.kangxu.device.vo.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zxx
 * @create: 2020-04-15 21:51
 **/
@Service
public class TestService {
    @Autowired
    private DevInfoMapper devInfoMapper;
    public int insertInfo (ResponseObject responseObject) {

        return  1;
    }
}
