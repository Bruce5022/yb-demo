package com.sky.yibao.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @shizhanwei
 * 封装本地程序对应的代理类
 */
public class LocalMedicareProxy {


    /**
     * 黑龙江医保动态库的方法
     * @param reqJson
     * @return
     */
    public static JSONObject ExeIFByteEncode(JSONObject reqJson) {
        /**
         *
         *
         *  1.封装本地程序需要的参数
         *
         *
         *  2.调用黑龙江医保本地程序
         */
        return reqJson;
    }


    /**
     * 长春医保医保动态库的方法：InitDLL
     * @param reqJson
     * @return
     */
    public static JSONObject InitDLL(JSONObject reqJson) {
        /**
         *
         *
         *  1.封装本地程序需要的参数
         *
         *
         *  2.调用长春医保医保动态库的方法：InitDLL
         */
        return reqJson;
    }



    /**
     * 长春医保医保动态库的方法：BUSINESSHANDLENEW
     * @param reqJson
     * @return
     */
    public static JSONObject BUSINESSHANDLENEW(JSONObject reqJson) {
        /**
         *
         *  1.封装本地程序需要的参数
         *
         *
         *
         *  2.调用长春医保医保动态库的方法：InitDLL
         */
        return reqJson;
    }



    /**
     * 吉林医保医保动态库的方法：BUSINESSDEAL
     * @param reqJson
     * @return
     */
    public static JSONObject BUSINESSDEAL(JSONObject reqJson) {
        /**
         *
         *
         *  1.封装本地程序需要的参数
         *
         *
         *  2.吉林医保医保动态库的方法：BUSINESSDEAL
         */
        return reqJson;
    }
}
