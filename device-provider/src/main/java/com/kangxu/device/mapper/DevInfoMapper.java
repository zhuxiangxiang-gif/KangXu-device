package com.kangxu.device.mapper;

import com.kangxu.device.pojo.DevInfo;

import java.util.List;

/**
 * 设备接口调用信息DAO
 */
public interface DevInfoMapper{
	
	/**
	 * 批量插入
	 * @param devInfoList
	 */
//	public void batchInsert(List<DevInfo> devInfoList);

	/**
	 * 根据机构编号和设备编号查询设备接口调用信息列表
	 * @param searchable
	 * @return
	 */
//	public List<DevInfo> findDevInfo(Searchable searchable);

	public boolean insert(DevInfo devInfo);

	public DevInfo findById(Long id);

	public List<DevInfo> findAll();

}
