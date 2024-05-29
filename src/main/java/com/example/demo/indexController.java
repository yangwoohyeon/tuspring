package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value="/data")
    public String data(Model model){
        model.addAttribute("data","name");
        return "data";
    }

    @GetMapping("/param")
    public String param(@RequestParam("name")String name, Model model){
        model.addAttribute("data","데이터");
        model.addAttribute("username",name);
        return "param1";
    }
}
