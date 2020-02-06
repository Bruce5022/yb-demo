package com.sky.yibao.controller;

import com.sky.yibao.service.DefaultYbService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shizhanwei
 * 通用医保接口Controller
 */
@RestController
@RequestMapping("/yb")
public class YbDefaultController extends YbBaseController<DefaultYbService> {


}
