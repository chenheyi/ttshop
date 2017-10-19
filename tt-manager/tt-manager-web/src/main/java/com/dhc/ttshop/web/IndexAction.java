package com.dhc.ttshop.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: DHC
 * Date: 2017/10/17
 * Time: 14:20
 * Version:V1.0
 * 跳转到后台管理系统的首页
 */
@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String index(){
        //WEB-INF/jsp/index.jsp
        return "index";
    }
}
