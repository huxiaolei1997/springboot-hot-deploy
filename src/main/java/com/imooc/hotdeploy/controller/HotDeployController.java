package com.imooc.hotdeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiaolei hu
 * @date 2019/5/11 14:18
 **/
@Controller
public class HotDeployController {
    @GetMapping(value = "/say")
    public String say(HttpServletRequest request) {
        request.setAttribute("say", "Hello imooc!");
        return "imooc";
    }
}
