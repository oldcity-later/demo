package com.study.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("start/")
public class Test2 {

    public String index(Model m){
        m.addAttribute("msg","hello Word");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Test2.class,args);
    }

}
