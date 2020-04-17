package com.kangxu.device.vo.useless;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: zxx
 * @create: 2020-04-15 15:21
 **/
@Data
public class Result<T> implements Serializable {
    /** 具体内容. */
    private T request;
    private int code;

}
