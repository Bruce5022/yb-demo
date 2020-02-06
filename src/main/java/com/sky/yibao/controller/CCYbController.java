package com.sky.yibao.controller;

import com.alibaba.fastjson.JSONObject;
import com.sky.yibao.service.CCYbService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author shizhanwei
 * 长春医保Controller
 */
@RestController
@RequestMapping("/ccyb")
public class CCYbController extends YbBaseController<CCYbService> {

    @PostMapping(value = "/approve", produces = "application/json;charset=UTF-8")
    public Object approve(@RequestBody String reqJson) {
        JSONObject param = JSONObject.parseObject(reqJson);
        return ybRealService.approve(param);
    }
}
