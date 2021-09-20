package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    //原来的： http://localhost:8080/add?a=1&b=2
    //RestFul：http://localhost:8080/add/a/b
    //映射访问路径
    //@RequestMapping(value="/commit/{p1}/{p2}",method = RequestMethod.Get)
    @GetMapping("/commit/{p1}/{p2}")
    public String index(@PathVariable String p1, @PathVariable String p2, Model model){

        String result = p1+p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果："+result);
        //返回视图位置
        return "test";
    }
}
