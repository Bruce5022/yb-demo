package com.sky.yibao.common;

public enum YbCompanyEnum {
    CHANG_CHUN("001", "CCYbServiceImpl", "长春医保"),
    JI_LIN("002", "JLYbServiceImpl", "吉林医保"),
    BEI_JING("003", "HLJYbServiceImpl", "黑龙江医保");


    YbCompanyEnum(String insuranceOrgId, String serviceName, String description) {
        this.insuranceOrgId = insuranceOrgId;
        this.serviceName = serviceName;
        this.description = description;
    }


    private String insuranceOrgId;
    private String serviceName;
    private String description;

    public String getInsuranceOrgId() {
        return insuranceOrgId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public static YbCompanyEnum getByInsuranceOrgId(String insuranceOrgId) {
        for (YbCompanyEnum typeEnum : values()) {
            if (!typeEnum.getInsuranceOrgId().equals(insuranceOrgId)) continue;
            return typeEnum;
        }
        return null;
    }

    public static YbCompanyEnum getByServiceName(String serviceName) {
        for (YbCompanyEnum typeEnum : values()) {
            if (!typeEnum.getServiceName().equals(serviceName)) continue;
            return typeEnum;
        }
        return null;
    }


}
