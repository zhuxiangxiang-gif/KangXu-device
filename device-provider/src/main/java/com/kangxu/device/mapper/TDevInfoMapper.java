package com.kangxu.device.mapper;

import com.kangxu.device.pojo.TDevInfo;
import com.kangxu.device.vo.RequestObject;
import com.kangxu.device.vo.ResponseObject;
import com.kangxu.device.vo.ResponseObject2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDevInfoMapper {
//    long countByExample(TDevInfoExample example);
//
//    int deleteByExample(TDevInfoExample example);

    //向下
    TDevInfo findByDevNo(@Param("devNo") String devNo);
    /**
     * 设置版本号
     */
    int SetVersion(@Param("requestObject") RequestObject requestObject);

    /**
     * 获取设备编号
     * @return
     */
    List<ResponseObject2> getDevnos(@Param("orgid") String orgid, @Param("devtype") String devtype);





    List<TDevInfo> findAll();

    int insert(TDevInfo record);

    int insertSelective(TDevInfo record);

//    List<TDevInfo> selectByExample(TDevInfoExample example);

//    int updateByExampleSelective(@Param("record") TDevInfo record, @Param("example") TDevInfoExample example);
//
//    int updateByExample(@Param("record") TDevInfo record, @Param("example") TDevInfoExample example);
}