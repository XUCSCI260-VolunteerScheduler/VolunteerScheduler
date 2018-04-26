package io.github.xucsci260volunteerscheduler.controller;


import io.github.xucsci260volunteerscheduler.domain.Volunteer;
import io.github.xucsci260volunteerscheduler.domain.requests.CreateUserRequest;
import io.github.xucsci260volunteerscheduler.domain.requests.GetUserRequest;
import io.github.xucsci260volunteerscheduler.domain.responses.CreateUserResponse;
import io.github.xucsci260volunteerscheduler.services.interfaces.UserService;
import io.github.xucsci260volunteerscheduler.domain.User;
import io.github.xucsci260volunteerscheduler.domain.helpers.GetMethodEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


// * The file UserController.java was created by Grant on 4:08 PM at 4/3/2018


@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/get/username/{username}", method = RequestMethod.GET)
    public @ResponseBody User getUserByUsername(@PathVariable("username") String username) {
        return getUser(new GetUserRequest(GetMethodEnum.USERNAME, 0, username, username));
    }

    @RequestMapping(value = "/users/get/email/{email}", method = RequestMethod.GET)
    public @ResponseBody User getUserByEmail(@PathVariable("email") String email) {
        return getUser(new GetUserRequest(GetMethodEnum.EMAIL, 0, email, ""));
    }

    @RequestMapping(value = "/users/get/id/{ID}", method = RequestMethod.GET)
    public @ResponseBody User getUserByID(@PathVariable("ID") int id) {
        return getUser(new GetUserRequest(GetMethodEnum.ID, id, "", ""));
    }

    private User getUser(GetUserRequest request) {
        return userService.getUser(request);
    }

    @RequestMapping(value = "/users/create", method = RequestMethod.POST)
    public String createUser(@RequestParam("username") String username,
                                         @RequestParam("email") String email,
                                         @RequestParam("firstName") String first,
                                         @RequestParam("lastName") String last,
                                         @RequestParam("dob") String dob,
                                         @RequestParam("password") String password) {

        CreateUserRequest request = new CreateUserRequest(dob, username, email, first, last, password);

        CreateUserResponse response = userService.createUser(request);

        String responseString = "createuserform";

        if (response.isSuccessful()) {
            responseString = "home";
        }

        return responseString;
    }

    @RequestMapping(value = "/CreateUser", method = RequestMethod.GET)
    public String createUserForm() {
        return "createuserform";
    }
}
