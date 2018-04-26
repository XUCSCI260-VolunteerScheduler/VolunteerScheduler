package io.github.xucsci260volunteerscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import io.github.xucsci260volunteerscheduler.domain.Event;
//import org.springframework.ui.Model;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String goHome() {
        //return "/src/main/resources/templates/home";
       return "home";
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
    @RequestMapping(value= {"/Event"})
    public String goCreateEvent(){
      return "Event";
    }

//    @RequestMapping(value = "/addEventT", method = RequestMethod.POST)
//    public String addEvent(@ModelAttribute Event event) {
//        eventRepository.save(event);
//        return "redirect:home";
//    }

}
