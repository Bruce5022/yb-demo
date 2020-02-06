package com.sky.yibao.controller;

import com.alibaba.fastjson.JSONObject;
import com.sky.yibao.service.YbBaseService;
import com.sky.yibao.service.impl.YbServiceImplAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class YbBaseController<T> {
    private static YbBaseService ybBaseService = new YbServiceImplAdaptor();
    @Autowired
    protected T ybRealService;


    @PostMapping(value = "/create", produces = "application/json;charset=UTF-8")
    public Object create(@RequestBody String reqJson) {
        JSONObject param = JSONObject.parseObject(reqJson);
        return ybBaseService.create(param);
    }


    @PostMapping(value = "/delete", produces = "application/json;charset=UTF-8")
    public Object delete(@RequestBody String reqJson) {
        JSONObject param = JSONObject.parseObject(reqJson);
        return ybBaseService.delete(param);
    }

    @PostMapping(value = "/update", produces = "application/json;charset=UTF-8")
    public Object update(@RequestBody String reqJson) {
        JSONObject param = JSONObject.parseObject(reqJson);
        return ybBaseService.update(param);
    }

    @PostMapping(value = "/read", produces = "application/json;charset=UTF-8")
    public Object read(@RequestBody String reqJson) {
        JSONObject param = JSONObject.parseObject(reqJson);
        return ybBaseService.read(param);
    }


}
