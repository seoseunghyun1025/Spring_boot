package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstController {
    @GetMapping("/hi") //리퀘스트 값이 됨
    public String niceToMeetYou(Model mo){
        mo.addAttribute("userName","서승현");
        System.out.println("niceToMeetYou Run!!!");
        return "greetings";
    }
    @GetMapping("/bye") //리퀘스트 값이 됨
    public String seeYouNext(Model mo){
        mo.addAttribute("userName","서승현");
        System.out.println("niceToMeetYou Run!!!");
        return "greetings";
    }
}
