package com.DemoProject.SpringBoot.repository;


import com.DemoProject.SpringBoot.dto.ResponseDto.WeatherResponseDTO;

public interface WeatherService {
    WeatherResponseDTO getWeatherByCity(String city);
}
