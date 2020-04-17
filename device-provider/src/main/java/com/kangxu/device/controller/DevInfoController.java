package com.kangxu.device.controller;

import com.kangxu.device.constant.DevConstant;
import com.kangxu.device.enmu.ResultEnum;
import com.kangxu.device.mapper.DevInfoMapper;
import com.kangxu.device.mapper.TDevInfoMapper;
import com.kangxu.device.pojo.DevInfo;
import com.kangxu.device.pojo.TDevInfo;
import com.kangxu.device.pojo.User;
import com.kangxu.device.service.TDevInfoService;
import com.kangxu.device.vo.*;
import com.kangxu.device.vo.useless.ResultVO;
import com.kangxu.device.vo.useless.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zxx
 * @create: 2020-04-15 11:26
 **/
@RestController
@Slf4j
//@RequestMapping(value = "/ribbon")
public class DevInfoController {

    @Autowired
    private DevInfoMapper devInfoMapper;
    @Autowired
    private TDevInfoMapper infoMapper;
    @Autowired
    private TDevInfoService infoService;

    /**
     * 1,设置设备版本号
     * @param requestObject
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/set/version")
    public ResponseObject updateSetVersion(@RequestBody RequestObject requestObject) throws Exception {
        String devno = requestObject.getDevno();
        if (StringUtils.isEmpty(devno)){
            throw new Exception();
        }
        String version = requestObject.getVersion();
        if (StringUtils.isEmpty(version)){
            throw new Exception();
        }
        Boolean devVersion = infoService.SetVersion(requestObject);
        ResponseObject2 responseObject2 = new ResponseObject2();
        ResponseObject responseObject = new ResponseObject();
        if (!devVersion){
            //设置设备版本号失败
            responseObject2.setRetcode(ResultEnum.RESULT_DEV_F.getCode());
            responseObject2.setRetdesc(ResultEnum.RESULT_DEV_F.getDesc());
            responseObject.setResponse(responseObject2);
            return responseObject;
        }
        //设置设备版本号成功
        responseObject2.setRetcode(ResultEnum.RESULT_DEV_T.getCode());
        responseObject2.setRetdesc(ResultEnum.RESULT_DEV_T.getDesc());
        responseObject.setResponse(responseObject2);
        return responseObject;
    }

    /**
     * 2,设置设备状态
     * @param requestObject
     */
    @PostMapping(value = "/set/status")
    public void setStatus(@RequestBody RequestObject requestObject){
//        String code = ResultEnum.RESULT_DEV_T.getCode();
        //1,获取适配端传输的数据
        String devno = requestObject.getDevno();
//        if (StringUtils.isEmpty(devno)){
//            return;
//        }
        String devtype = requestObject.getDevtype();
        String status = requestObject.getStatus();
        if (StringUtils.isEmpty(status)){
            return;
        }
        String[] split = status.split("|");
        System.out.println(split);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //2,需要根据设备状态，判断
    }


    /**
     * 3,获取设备编号
     * @param requestObject
     * @return
     */
    @PostMapping(value = "/get/devnos")
    public ResponseObject getDevnos(@RequestBody RequestObject requestObject){
        List<ResponseObject2> devnos = infoService.getDevnos(requestObject);
        ArrayList list = new ArrayList<>();
        ResponseObject2 responseObject2 = new ResponseObject2();
        ResponseObject responseObject = new ResponseObject();
        ResponseDevnos responseDevnos = new ResponseDevnos();
        if (devnos != null && devnos.size() > 0){
            for (ResponseObject2 dev : devnos){
                String devno = dev.getDevno();
                list.add(devno);
            }
            Object[] toArray = list.toArray();
            responseDevnos.setDevnoArr(toArray);
//        responseObject.setResponse();
            responseObject2.setRetcode("true");
            responseObject2.setRetdesc("成功");
            responseObject.setResponseDevnos(responseDevnos);
            responseObject.setResponse(responseObject2);
            return responseObject;
        }
        responseObject2.setRetcode("false");
        responseObject2.setRetdesc("失败");
        responseObject.setResponse(responseObject2);
        return responseObject;

    }


    /**
     * 7,新增订阅设备
     * @param devno
     * @param devtype
     */
    //后台添加设备的时候，调用这个接口，  接着转发给适配器
    @RequestMapping(value = "add/dev",method = RequestMethod.POST)
    public void addDevice(@PathVariable("devno") String devno,@PathVariable("devtype") String devtype){
        //后台管理调用
        if (StringUtils.isEmpty(devno)){
            log.info("设备号，为空",devno);
        }
        if (StringUtils.isEmpty(devtype)){
            log.info("设备类型，为空",devtype);
        }

        RequestObject requestObject = new RequestObject();
        requestObject.setDevno(devno);
        requestObject.setDevtype(devtype);
        //TODO   调用适配端  把参数传过去

        //TODO   接受适配端返回的结果
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
        List<TDevInfo> infos = infoMapper.findAll();
        return ResultVOUtil.success(infos,null);
    }


    /**
     * RequestMappping = GETMappping ,postmapping,putmapping,deletemapping
     */
    public void insertPosition () {

    }


}
