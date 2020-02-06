package com.sky.yibao.common;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class RespApi {

    public static JSONObject succuss(String msg) {
        return succuss(msg, new HashMap<>());
    }

    public static JSONObject succuss(String msg, Object data) {
        JSONObject map = new JSONObject();
        map.put("head", new Header(0, msg));
        map.put("data", data);
        return map;
    }

    public static JSONObject fail(String msg, Object data) {
        JSONObject map = new JSONObject();
        map.put("head", new Header(-1, msg));
        map.put("data", data);
        return map;
    }

    public static JSONObject fail(String msg) {
        return fail(msg, new HashMap<>());
    }


}