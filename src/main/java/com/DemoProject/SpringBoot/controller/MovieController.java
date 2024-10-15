package com.DemoProject.SpringBoot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/public")
public class MovieController {

    @GetMapping("/movies")
    public ResponseEntity<String> getMovies(){
        return ResponseEntity.ok("Good will");
    }
}
