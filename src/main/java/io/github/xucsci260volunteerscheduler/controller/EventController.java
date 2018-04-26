package io.github.xucsci260volunteerscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import src.main.java.io.github.xucsci260volunteerscheduler.domain.Event.java;
//import src.main.java.io.github.xucsci260volunteerscheduler.dal.interfaces.EventRepository.java;
import io.github.xucsci260volunteerscheduler.domain.Event;
import io.github.xucsci260volunteerscheduler.dal.interfaces.EventRepository;
import io.github.xucsci260volunteerscheduler.dal.implementations.EventRpositoryImpl;
import java.util.List;
import org.springframework.ui.Model;





@Controller

public class EventController {
    @Autowired
    private eventRepositoryImpl eventRepositoryImpl;

    @RequestMapping(value="/events/create", method = RequestMethod.GET)
    public String addNewEvent(@RequestParam String name, @RequestParam String desc, @RequestParam String email, @RequestParam String address, @RequestParam String city, @RequestParam String zip, @RequestParam String state, @RequestParam String startTime, @RequestParam String endTime, @RequestParam String date) {
        Event e = new Event(name, desc, email, address, city, zip, state, startTime, endTime, date);
/*
        e.setName(name);
        e.setDesc(desc);
        e.setEmail(email);
        e.setPhone(phone);
        e.setAddress(address);
        e.setCity(city);
        e.setZip(zip);
        e.setState(state);
        eventRepository.save(e);
        */
        eventRepository.save(e);
        return "redirect:/home";
    }

    @GetMapping(path="/all")
    public @ResponseBody List<Event> getAllEvents() {
        return eventRepositoryImpl.findAll();

    }

    @RequestMapping(path="/home")
    public String home(Model model){
        model.addAttribute("eventList", eventRepositoryImpl.findAll());
        return "home";
    }

    @RequestMapping(value="/addEventT", method=RequestMethod.POST)
    public String addEvent(@ModelAttribute Event event) {
        eventRepositoryImpl.save(event);
        return "redirect:home";
    }
}
