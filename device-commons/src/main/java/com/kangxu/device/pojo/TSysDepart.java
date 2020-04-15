package com.kangxu.device.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: zxx
 * @create: 2020-04-15 13:56
 **/
@Data
public class TSysDepart {

    private Long id;

    private String sdName;

    private String sdMemo;

    private String sdPid;

    private String sdCode;

    private String sdType;

    private String sdMobile;

    private String sdFax;

    private String sdAddress;

    private Short sdOrder;

    private Short deleted;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;
}
