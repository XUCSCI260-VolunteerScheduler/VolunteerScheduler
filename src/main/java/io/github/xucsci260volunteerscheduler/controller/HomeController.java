package io.github.xucsci260volunteerscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String goHome() {
        //return "/src/main/resources/templates/home.html";
       return "home";
//<<<<<<< HEAD
//=======
}

    @RequestMapping(value = {"/about"})
      public String goAbout() {
        return "about";
      }
    @RequestMapping(value = {"/Login"})
    public String goLogin() {
      return "Login";
    }
    @RequestMapping(value = {"/CreateUser"})
    public String goCreateUser() {
      return "CreateUser";
}
    @RequestMapping(value= {"/CreateEvent"})
    public String goCreateEvent(){
      return "Event";
    }

//>>>>>>> dev
}
