package org.devlos.rest_server.controller;

import org.devlos.rest_server.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/server")
public class ApiController {

    @GetMapping("")
    public User hello(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName("stive");
        user.setAge(10);
        return user;
    }
}
