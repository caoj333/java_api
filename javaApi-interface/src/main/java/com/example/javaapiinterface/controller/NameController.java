package com.example.javaapiinterface.controller;

import com.example.apiclientsdk.model.User;
import com.example.apiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 查询名称api
 *
 * @author 25793
 */

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name){
        return "GET 你的名字是" +name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" +name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        String userSign = SignUtils.getSign(body, "abcdefg");

        if (!sign.equals(userSign)){
            return "无权限";
        }

        return "POST 你的名字是" +user.getUserName();
    }
}
