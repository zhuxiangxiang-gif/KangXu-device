package com.kangxu.device.mapper;

import com.kangxu.device.pojo.TDevInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDevInfoMapper {
//    long countByExample(TDevInfoExample example);
//
//    int deleteByExample(TDevInfoExample example);
    List<TDevInfo> findAll();

    int insert(TDevInfo record);

    int insertSelective(TDevInfo record);

//    List<TDevInfo> selectByExample(TDevInfoExample example);

//    int updateByExampleSelective(@Param("record") TDevInfo record, @Param("example") TDevInfoExample example);
//
//    int updateByExample(@Param("record") TDevInfo record, @Param("example") TDevInfoExample example);
}