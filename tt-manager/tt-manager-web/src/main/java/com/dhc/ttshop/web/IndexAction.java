package com.dhc.ttshop.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: chenbo
 * Date: 2017/10/20
 * Time: 20:36
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
