package com.kangxu.device.enmu;

import lombok.Data;


public enum ResultEnum {

    RESULT_DEV_T("true", "成功"),
    RESULT_DEV_F("false", "失败"),
    ;
    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ResultEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
