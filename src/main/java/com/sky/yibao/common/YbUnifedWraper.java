package com.sky.yibao.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @author shizhanwei
 * 医保统一入参出参接口，留着给不同医保实现吧
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
