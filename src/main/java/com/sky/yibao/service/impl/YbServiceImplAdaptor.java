package com.sky.yibao.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sky.yibao.common.SpringContextHolder;
import com.sky.yibao.common.YbCompanyEnum;
import com.sky.yibao.common.YbUnifedWraper;
import com.sky.yibao.service.YbBaseService;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @shizhanwei
 * 适配层：
 *  1.转发请求
 *  2.检查公共参数
 *  3.统一封装入参
 *  4.统一封装出参
 */
public final class YbServiceImplAdaptor implements YbBaseService {
    private static Map<String, YbBaseService> ybServiceMap = new HashMap<>();

    static {
        // 获取所有实现了YbBaseService的类
        Map<String, YbBaseService> beansMap = SpringContextHolder.getBeanByType(YbBaseService.class);
        Set<String> serviceNames = beansMap.keySet();
        for (String serviceName : serviceNames) {
            YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(serviceName);
            if (companyEnum != null) {
                // 为集合赋值
                YbBaseService ybRealService = SpringContextHolder.getBean(serviceName);
                ybServiceMap.put(companyEnum.getInsuranceOrgId(), ybRealService);
            }
        }
    }


    @Override
    public JSONObject read(JSONObject reqJson) {
        // 1.检查参数
        checkParam(reqJson);

        // 2.转发请求
        String insuranceOrgId = reqJson.getString("insuranceOrgId");
        YbBaseService ybRealService = ybServiceMap.get(insuranceOrgId);

        // 3.统一入参
        reqJson = YbUnifedWraper.unifiedRequest(reqJson);

        // 4.调用实际参数
        JSONObject resp = ybRealService.read(reqJson);

        // 5.统一出参
        return YbUnifedWraper.unifiedResponse(resp);
    }

    @Override
    public JSONObject create(JSONObject reqJson) {
        // 1.检查参数
        checkParam(reqJson);

        // 2.转发请求
        String insuranceOrgId = reqJson.getString("insuranceOrgId");
        YbBaseService ybRealService = ybServiceMap.get(insuranceOrgId);

        // 3.统一入参
        reqJson = YbUnifedWraper.unifiedRequest(reqJson);

        // 4.调用实际参数
        JSONObject resp = ybRealService.create(reqJson);

        // 5.统一出参
        return YbUnifedWraper.unifiedResponse(resp);
    }

    @Override
    public JSONObject delete(JSONObject reqJson) {
        // 1.检查参数
        checkParam(reqJson);

        // 2.转发请求
        String insuranceOrgId = reqJson.getString("insuranceOrgId");
        YbBaseService ybRealService = ybServiceMap.get(insuranceOrgId);

        // 3.统一入参
        reqJson = YbUnifedWraper.unifiedRequest(reqJson);

        // 4.调用实际参数
        JSONObject resp = ybRealService.delete(reqJson);

        // 5.统一出参
        return YbUnifedWraper.unifiedResponse(resp);
    }

    @Override
    public JSONObject update(JSONObject reqJson) {
        // 1.检查参数
        checkParam(reqJson);

        // 2.转发请求
        String insuranceOrgId = reqJson.getString("insuranceOrgId");
        YbBaseService ybRealService = ybServiceMap.get(insuranceOrgId);

        // 3.统一入参
        reqJson = YbUnifedWraper.unifiedRequest(reqJson);

        // 4.调用实际参数
        JSONObject resp = ybRealService.update(reqJson);

        // 5.统一出参
        return YbUnifedWraper.unifiedResponse(resp);
    }


    public void checkParam(JSONObject param) {
        String insuranceOrgId = param.getString("insuranceOrgId");
        if (StringUtils.isEmpty(insuranceOrgId)) throw new RuntimeException("保险机构ID不能为空");
        YbBaseService ybRealService = ybServiceMap.get(insuranceOrgId);
        if (ObjectUtils.isEmpty(ybRealService)) throw new RuntimeException("不支持当前医保");
    }

}
