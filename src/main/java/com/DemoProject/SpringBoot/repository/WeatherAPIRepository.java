package com.DemoProject.SpringBoot.repository;

import com.DemoProject.SpringBoot.configuration.WeatherAPIInterceptor;
import com.DemoProject.SpringBoot.dto.ResponseDto.WeatherResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openweathermap", url = "https://api.openweathermap.org/data/2.5", configuration = WeatherAPIInterceptor.class)
public interface WeatherAPIRepository {

    @GetMapping("/weather")
    ResponseEntity<WeatherResponseDTO> getByCityName(@RequestParam("q") String city);
}
