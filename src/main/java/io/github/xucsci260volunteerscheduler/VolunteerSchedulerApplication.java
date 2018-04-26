package io.github.xucsci260volunteerscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VolunteerSchedulerApplication {

    @RequestMapping(value = {"/", "/home"})
    public String home(){
      return "home";
    }
    public static void main(String[] args) {
        SpringApplication.run(VolunteerSchedulerApplication.class, args);
    }
}
