package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by korol on 2016/6/28.
 */
@Controller
public class SecondController {
    @RequestMapping("/re")
    public @ResponseBody String index1(){
        return "Hello World";
    }

}
