package com.sky.yibao.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sky.yibao.common.LocalMedicareProxy;
import com.sky.yibao.common.RespApi;
import com.sky.yibao.common.YbCompanyEnum;
import com.sky.yibao.service.CCYbService;
import org.springframework.stereotype.Service;

@Service
public class CCYbServiceImpl extends YbServiceDefaultImpl implements CCYbService {

    @Override
    public JSONObject read(JSONObject reqJson) {
        String insuranceOrgId = reqJson.getString("insuranceOrgId");
        YbCompanyEnum companyEnum = YbCompanyEnum.getByInsuranceOrgId(insuranceOrgId);
        JSONObject resp = LocalMedicareProxy.BUSINESSHANDLENEW(reqJson);
        return RespApi.succuss(companyEnum.getDescription() + "【查询】成功", resp);
    }

    @Override
    public JSONObject approve(JSONObject reqJson) {
        String simpleName = this.getClass().getSimpleName();
        YbCompanyEnum companyEnum = YbCompanyEnum.getByServiceName(simpleName);
        return RespApi.succuss(companyEnum.getDescription() + "【审批】成功");
    }
}
