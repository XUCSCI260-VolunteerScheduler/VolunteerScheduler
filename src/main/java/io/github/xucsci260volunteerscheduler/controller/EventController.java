package io.github.xucsci260volunteerscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import src.main.java.io.github.xucsci260volunteerscheduler.domain.Event.java;
//import src.main.java.io.github.xucsci260volunteerscheduler.dal.interfaces.EventRepository.java;
import io.github.xucsci260volunteerscheduler.domain.Event;
import io.github.xucsci260volunteerscheduler.dal.interfaces.EventRepository;

@Controller
@RequestMapping(path="/home")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value="/addEvent", method = RequestMethod.POST)
    public String addNewEvent(@RequestParam String name, @RequestParam String desc, @RequestParam String email, @RequestParam String phone, @RequestParam String address, @RequestParam String city, @RequestParam String zip, @RequestParam String state, @RequestParam String startTime, @RequestParam String endTime, @RequestParam String date) {
        Event e = new Event(name, desc, email, phone, address, city, zip, state, startTime, endTime, date);
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
        return "home";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
