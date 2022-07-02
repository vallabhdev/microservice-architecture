package com.prateeksoni.user.controller;

import com.prateeksoni.user.VO.ResponseTemplateVO;
import com.prateeksoni.user.entity.Users;
import com.prateeksoni.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users users) {
        LoggerFactory.getLogger(UserController.class).info("Saving the given user");
        return userService.saveUser(users);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDept(@PathVariable("id") Long userId) {
        return userService.getUserByDept(userId);
    }
}
