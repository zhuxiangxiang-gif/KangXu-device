package com.kangxu.device.test;

import com.kangxu.device.enmu.ResultEnum;
import com.kangxu.device.vo.ResponseObject2;
import com.sun.xml.internal.ws.policy.jaxws.SafePolicyReader;

/**
 * @author: zxx
 * @create: 2020-04-17 15:08
 **/
public class Test1 {

    public static void main(String[] args) {
        String status = "3|2|0|5|7|4";
        String[] split = status.split("\\|");
        System.out.println(split.length);
        String s1 = split[3];
//        System.out.println(s1+"##########");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
//            if (s.equals("3")){
//                System.out.println("88888888");
//            }
            System.out.println("----"+ split[i]);
        }
    }


}
