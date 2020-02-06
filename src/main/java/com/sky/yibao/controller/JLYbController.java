package com.sky.yibao.controller;

import com.sky.yibao.service.JLYbService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shizhanwei
 * 吉林医保Controller
 */
@RestController
@RequestMapping("/jlyb")
public class JLYbController extends YbBaseController<JLYbService> {


}
