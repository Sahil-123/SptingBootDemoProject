package com.DemoProject.SpringBoot.controller;

import com.DemoProject.SpringBoot.dto.UserDTO;
import com.DemoProject.SpringBoot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity saveUser(@RequestBody UserDTO userDTO){
        log.info("saving users data from controller");
        return ResponseEntity.ok(userService.save(userDTO));
    }
}
