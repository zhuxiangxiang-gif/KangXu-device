package com.kangxu.device.vo;

import lombok.Data;

/**
 * @author: zxx
 * @create: 2020-04-15 21:35
 **/
@Data
public class ResponseObject {
    /**
     * {
     “header”:{
     “tradcode”:“SJ001”,
     “channel”:“1”,
     “appid”:“20200312344”,
     “sgin”:”iswbOUtB5944XjA0heC+39hzl/oaAMCTk……”,
     “timestamp”:”2020-03-14 22:07:33”
     },
     “response”:{
     “retcode”:”true”,
     “retdesc”:”成功”
     }
     }
     */
    private HeaderObject header;
    private ResponseObject2 response;
    private ResponseDevnos responseDevnos;
}
