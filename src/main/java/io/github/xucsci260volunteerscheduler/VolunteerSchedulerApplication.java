package io.github.xucsci260volunteerscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
public class VolunteerSchedulerApplication {

    @RequestMapping("/home")
    @ResponseBody
    String home(){
      return "../../../resources/templates/home";
    }

    public static void main(String[] args) {
        SpringApplication.run(VolunteerSchedulerApplication.class, args);
    }
}
