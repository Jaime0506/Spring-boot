package com.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping("/api/users")
public class UserController {

    private ArrayList<String> users = new ArrayList<>();

    public void setUser(String user) {
        users.add(user);
    }

    public UserController() {
        setUser("jaime");
        setUser("Pepe");
        setUser("Mejia");
    }

    @GetMapping
    @ResponseBody
    public String getUsers() {
        return users.toString();
    }
}
