package org.devlos.rest_server.controller;

import lombok.extern.slf4j.Slf4j;
import org.devlos.rest_server.dto.Req;
import org.devlos.rest_server.dto.User;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
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

    @PostMapping("/user/{userId}/name/{userName}")
    public Req<User> post(
                     HttpEntity<String> entity,
                     @RequestBody Req<User> user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization, @RequestHeader("custom-header") String customHeader){
          log.info("req: {}", entity.getBody());
//        log.info("userId : {}, userName : {}", userId, userName);
//        log.info("authorization: {}, customer: {}", authorization, customHeader);
//        log.info("client req: {}", user);

        Req<User> response = new Req<>();
        response.setHeader(
                new Req.Header()
        );
        response.setResBody(user.getResBody());

        return response;
    }
}
