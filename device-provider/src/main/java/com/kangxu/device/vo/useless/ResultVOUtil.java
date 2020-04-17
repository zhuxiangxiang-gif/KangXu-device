package com.kangxu.device.vo.useless;

import com.kangxu.device.vo.useless.ResultVO;

/**
 * Created by
 * 2017-05-15 00:22
 */
public class ResultVOUtil {

    public static ResultVO success(Object object, Object obj) {
        ResultVO resultVO = new ResultVO();
        resultVO.setRequest(object);
        resultVO.setHeaders(obj);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null,null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
