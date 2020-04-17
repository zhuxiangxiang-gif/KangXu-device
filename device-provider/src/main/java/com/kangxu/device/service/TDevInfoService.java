package com.kangxu.device.service;

import com.kangxu.device.mapper.TDevInfoMapper;
import com.kangxu.device.pojo.TDevInfo;
import com.kangxu.device.vo.RequestObject;
import com.kangxu.device.vo.ResponseObject2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zxx
 * @create: 2020-04-16 10:53
 **/
@Service
public class TDevInfoService {

    @Autowired
    private TDevInfoMapper infoMapper;

    //设置版本号
    public Boolean SetVersion(RequestObject requestObject){
        String devno = requestObject.getDevno();
        TDevInfo byDevNo = infoMapper.findByDevNo(devno);
        String diBackup1 = byDevNo.getDiBackup1();
        if (diBackup1.equals(requestObject.getVersion())){
            return false;
        }
        int i = infoMapper.SetVersion(requestObject);
        System.out.println(i);
        if (i == 1){
            return true;
        }
        return false;
    }


    //获取设备号
    public List<ResponseObject2> getDevnos(RequestObject requestObject) {
        String orgid = requestObject.getOrgid();
        String devtype = requestObject.getDevtype();
        List<ResponseObject2> devnos = infoMapper.getDevnos(orgid, devtype);
        if (devnos != null && devnos.size() > 0){

        }
        for (ResponseObject2 d : devnos){
            System.out.println(d.getDevno());
        }
        return devnos;
    }


}
