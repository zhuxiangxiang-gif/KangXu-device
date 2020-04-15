package com.kangxu.device.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: zxx
 * @create: 2020-04-15 13:57
 **/
@Data
public class TDevStatus {

    private Long id;

    private String dsDevNo;

    private String dsStatus;

    private Date dsStatusTime;

    private String dsCount;
}
