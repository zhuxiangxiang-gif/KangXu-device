package com.kangxu.device.vo;

import lombok.Data;

/**
 * @author: zxx
 * @create: 2020-04-15 21:21
 **/
@Data
public class RequestObject {
    /**
     * devno”:”A1001”,
     “devtype”:”1”,
     “version”:”1.4.5”
     */
    private String devno;
    private String devtype;
    private String version;

    /*“orgid”:”865000”,
        获取设备编号
      “devtype”:”1”*/
    private String orgid;
    private String status;
}
