package com.DemoProject.SpringBoot.repository;

import com.DemoProject.SpringBoot.dto.ResponseDto.WeatherResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherAPIRepository weatherAPIRepository;

    @Autowired
    public WeatherServiceImpl(WeatherAPIRepository weatherAPIRepository) {
        this.weatherAPIRepository = weatherAPIRepository;
    }

    @Override
    public WeatherResponseDTO getWeatherByCity(String city) {
        ResponseEntity<WeatherResponseDTO> response = weatherAPIRepository.getByCityName(city);
        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to retrieve weather data for city: " + city);
        }
    }
}
