package com.sky.yibao.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sky.yibao.common.RespApi;
import com.sky.yibao.common.YbCompanyEnum;
import com.sky.yibao.service.YbBaseService;
/**
 * @author shizhanwei
 * 默认实现通用的接口，如果没定义，就报默认错误
 */
public abstract class YbServiceDefaultImpl implements YbBaseService {

    @Override
    public JSONObject read(JSONObject reqJson) {
        String simpleName = this.getClass().getSimpleName();
        YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(simpleName);
        return RespApi.fail(companyEnum.getDescription() + "没实现【查询】方法");
    }

    @Override
    public JSONObject create(JSONObject reqJson) {
        String simpleName = this.getClass().getSimpleName();
        YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(simpleName);
        return RespApi.fail(companyEnum.getDescription() + "没实现【新增】方法");
    }

    @Override
    public JSONObject delete(JSONObject reqJson) {
        String simpleName = this.getClass().getSimpleName();
        YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(simpleName);
        return RespApi.fail(companyEnum.getDescription() + "没实现【刪除】方法");
    }

    @Override
    public JSONObject update(JSONObject reqJson) {
        String simpleName = this.getClass().getSimpleName();
        YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(simpleName);
        return RespApi.fail(companyEnum.getDescription() + "没实现【修改】方法");
    }
}
