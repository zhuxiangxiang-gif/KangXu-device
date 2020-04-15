package com.kangxu.device.mapper;

import com.kangxu.device.pojo.TSysDepart;

public interface TSysDepartMapper {
//    long countByExample(TSysDepartExample example);
//
//    int deleteByExample(TSysDepartExample example);

    int insert(TSysDepart record);

    int insertSelective(TSysDepart record);

//    List<TSysDepart> selectByExample(TSysDepartExample example);
//
//    int updateByExampleSelective(@Param("record") TSysDepart record, @Param("example") TSysDepartExample example);
//
//    int updateByExample(@Param("record") TSysDepart record, @Param("example") TSysDepartExample example);
}