package com.pigbaby.pj.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("{page}")
    public String pageIndex(@PathVariable String page){
        return page;
    }
    public void test1(){
        System.out.println("hello");
    }
}
