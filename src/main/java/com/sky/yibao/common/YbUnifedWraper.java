package com.sky.yibao.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @author shizhanwei
 * 不同医保字段有统一标准
 *  入参，出参在如下方法子类中统一映射
 */
public abstract class YbUnifedWraper {

    /**
     * 统一入参结构
     *
     * @param reqJson
     * @return
     */
    public static JSONObject unifiedRequest(JSONObject reqJson) {
        return reqJson;
    }


    /**
     * 统一出参结构
     *
     * @param respJson
     * @return
     */
    public static JSONObject unifiedResponse(JSONObject respJson) {
        return respJson;
    }
}
