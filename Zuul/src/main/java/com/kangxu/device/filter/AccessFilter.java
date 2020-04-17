package com.kangxu.device.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zxx
 * @create: 2020-04-16 16:33
 **/
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }


    @Override
    public int filterOrder() {
        return 0;
    }


    @Override
    public boolean shouldFilter() {
        return true;
    }


    @Override
    public Object run() throws ZuulException {
        //获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取Request
        HttpServletRequest request = ctx.getRequest();
        //获取请求参数accessToken
        String accessToken = request.getParameter("accessToken");
        //使用String工具类
        if (StringUtils.isBlank(accessToken)) {
//            log.warn("accessToken is empty");
            ctx.setSendZuulResponse(false);  //进行拦截
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("accessToken is empty");
            } catch (Exception e) {
            }
            return null;
        }
        System.out.println("EEEEEEEEEEEEE");
//        log.info("access is ok");
        return null;
    }


}
