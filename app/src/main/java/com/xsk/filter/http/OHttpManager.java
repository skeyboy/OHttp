package com.xsk.filter.http;

import com.xsk.filter.filter.OHttpRequestFilter;
import com.xsk.filter.filter.OHttpRequestManager;

import java.util.Map;

public class OHttpManager {
    public static OHttpManager manager = new OHttpManager();
    private OHttpRequestManager oHttpRequestManager;

    private OHttpManager() {

    }

    /**
     * 添加参数过滤器，来顾虑掉不合法的网络请求
     *
     * @param requestFilter
     * @return
     */
    public OHttpManager addRequestFilter(OHttpRequestFilter requestFilter) {
        oHttpRequestManager.add(requestFilter);
        return this;
    }

    /**
     * 发送一个post请求
     *
     * @param url
     * @param method
     * @param params
     */
    public void POST(String url, OHttpMethod method, Map<String, Object> params) {
        if (!oHttpRequestManager.requestFilter(params)) {
            return;
        }
        //TODO 后续的是网络操作




    }
}
