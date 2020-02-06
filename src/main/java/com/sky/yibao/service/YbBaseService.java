package com.sky.yibao.service;

import com.alibaba.fastjson.JSONObject;
/**
 * @author shizhanwei
 * 通用的标准的医保接口方法
 */
public interface YbBaseService {

    /**
     * 查询
     * @param reqJson
     * @return
     */
    JSONObject read(JSONObject reqJson);


    /**
     * 新增
     * @param reqJson
     * @return
     */
    JSONObject create(JSONObject reqJson);


    /**
     * 删除
     * @param reqJson
     * @return
     */
    JSONObject delete(JSONObject reqJson);

    /**
     * 修改
     * @param reqJson
     * @return
     */
    JSONObject update(JSONObject reqJson);
}
