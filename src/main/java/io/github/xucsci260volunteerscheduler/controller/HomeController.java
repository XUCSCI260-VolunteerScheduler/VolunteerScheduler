package io.github.xucsci260volunteerscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String goHome() {
        return "home";
}

    @RequestMapping(value = {"/about"})
      public String goAbout() {
        return "about";
      }

    }
