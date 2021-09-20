package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    //@RequestParam("username") : username提交的域的名称 .
    public String test1(@RequestParam("username") String name, Model model){
        //1，接收前端参数
        System.out.println("接收到前端的参数为："+name);
        //2，将返回的结果传递给前端，Model
        model.addAttribute("msg",name);
        //3，视图跳转
        return "test";
    }
    //1，接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
    //2,假设传递的是一个对象User，匹配User对象中的字段名：如果名字一致则OK，否则匹配不到
    //前端接受的是一个对象：id，name，age
    @GetMapping("/t2")
    public String test2(User user,Model model){
        //1，接收前端参数
        System.out.println("接收到前端的参数为："+user);
        //2，将返回的结果传递给前端，Model
        model.addAttribute("msg",user);
        //3，视图跳转
        return "test";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name, ModelMap model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("name",name);
        System.out.println(name);
        return "test";
    }
}
