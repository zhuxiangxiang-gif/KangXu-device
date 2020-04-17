package com.kangxu.device.vo;

import lombok.Data;

/**
 * @author: zxx
 * @create: 2020-04-15 21:16
 * {
“header”:{
“tradcode”:”SJ001”,
“channel”:”1”,
“appid”:”20200312344”,
“sgin”:”iswbOUtB5944XjA0heC+39hzl/oaAMCTk……”,
“timestamp”:”2020-03-14 22:07:33”
},
“request”:{
“devno”:”A1001”,
“devtype”:”1”,
“version”:”1.4.5”
}
}
 **/
@Data
public class HeaderObject {
    private String tradcode;
    private String channel;
    private String appid;
    private String sgin;
    private String timestamp;
}
