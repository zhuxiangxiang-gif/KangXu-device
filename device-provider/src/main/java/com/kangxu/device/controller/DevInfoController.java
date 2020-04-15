package com.kangxu.device.controller;

import com.kangxu.device.mapper.DevInfoMapper;
import com.kangxu.device.mapper.TDevInfoMapper;
import com.kangxu.device.pojo.DevInfo;
import com.kangxu.device.pojo.TDevInfo;
import com.kangxu.device.pojo.User;
import com.kangxu.device.vo.ResultVO;
import com.kangxu.device.vo.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zxx
 * @create: 2020-04-15 11:26
 **/
@RestController
public class DevInfoController {
    @Autowired
    private DevInfoMapper devInfoMapper;
    @Autowired
    private TDevInfoMapper tDevInfoMapper;

    @RequestMapping(value = "/set/version",method = RequestMethod.POST)
    public void setDeviceVersion(){

    }


    /**
     * 添加设备
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addDevice(){

    }

    @RequestMapping(value = "/findId/{id}")
    public ResultVO<DevInfo> findById(@PathVariable("id") Long id){
        DevInfo info = devInfoMapper.findById(id);
        User user = new User();
        user.setAge(45);
        user.setName("小李");
        return ResultVOUtil.success(info,user);
    }
    @RequestMapping(value = "findAllDevInfo",method = RequestMethod.GET)
    public ResultVO<List<TDevInfo>> findAll(){
//        Map<String,Object> map = new HashMap();
        List<TDevInfo> infos = tDevInfoMapper.findAll();
        return ResultVOUtil.success(infos,null);
    }
}
