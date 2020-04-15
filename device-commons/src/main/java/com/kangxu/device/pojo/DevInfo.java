package com.kangxu.device.pojo;

import com.kangxu.device.pojo.DevInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备接口调用信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevInfo implements Serializable {

	private Long id;// ID

	private String diDevNo;//设备编号

	private String diDepartId = "";// 机构id

	private String diDevBrand = "";// 设备品牌

	private String diDevType = "";// 设备类型

	private String diDevModel = "";// 设备型号

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date diInstallDate;// 设备安装时间

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date diOverDate;// 设备过保时间

	private String diStatus = "";// 记录状态 0禁用、1启用

	private String diRemarks = "";// 备注

	private String diBackup1 = "";// 保留字段1

	private String diBackup2 = "";// 保留字段2

	private Boolean deleted;// 删除标记

	//关联字段
	private String diDepartName = "";// 机构名称

	private String diDevBrandName = "";// 设备品牌

	private String diDevTypeName = "";// 设备类型

	private String diDevModelName = "";// 设备型号

	private Date createTime = new Date();

	private String createUser;

	private Date updateTime = new Date();

	private String updateUser;

}