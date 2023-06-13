package com.itvdn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloITVDNController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloITVDN() {
        return "index.jsp";
    }

    @GetMapping(value = "/bye")
    public String bye() {
        return "bye.jsp";
    }

    @GetMapping(value = "/pass-data")
    public String passDataFromUser() {
        return "pass-data.jsp";
    }

    // С нашей View, т.е. с pass-data.jsp к нам будут приходить данные, которые должны будут заполнить атрибуты класса User
    @PostMapping(value = "/pass-data")
    public ModelAndView passDataFromUser(@ModelAttribute("user") User user, ModelAndView modelAndView) {
        System.out.println(user);
        //Префикс forward говорит спрингу, что данные, которые будут засэччены в ModelAndView
        // должны быть перенаправлены на страницу summary.jsp
        modelAndView.setViewName("forward:summary.jsp");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

//    Использование @PathVariable при обработке урлы
    // Написание /greeting - Особенность того, что если бы мы написали без слеша, то нас бы перенаправило на урлу:
//    localhost8080:/path/greeting.jsp
    @GetMapping(value = "/path/{userName}")
    public ModelAndView greeting(@PathVariable String userName, ModelAndView modelAndView) {
        modelAndView.setViewName("forward:/greeting.jsp");
        modelAndView.addObject("userName", userName);
        return modelAndView;
    }

}
