package com.DemoProject.SpringBoot.controller;

import com.DemoProject.SpringBoot.dto.ResponseDto.WeatherResponseDTO;
import com.DemoProject.SpringBoot.repository.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping(name = "/",  produces = "application/json")
    public ResponseEntity<WeatherResponseDTO> getWeather(@RequestParam("city") String city, Model model) {
            WeatherResponseDTO weatherData = weatherService.getWeatherByCity(city);
            model.addAttribute("weather", weatherData);
            return ResponseEntity.ok(weatherData);
    }
}
