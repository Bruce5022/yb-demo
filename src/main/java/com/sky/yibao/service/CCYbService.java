package com.sky.yibao.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author shizhanwei
 * 长春医保特有的方法在这里定义
 */
public interface CCYbService {

    /**
     * 长春医保特有的审批接口
     * @param reqJson
     * @return
     */
    JSONObject approve(JSONObject reqJson);
}
