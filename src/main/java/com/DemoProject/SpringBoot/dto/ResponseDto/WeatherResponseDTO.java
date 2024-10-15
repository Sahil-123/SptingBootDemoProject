package com.DemoProject.SpringBoot.dto.ResponseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WeatherResponseDTO {

    private CoordDTO coord;
    private List<WeatherDTO> weather;
    private String base;
    private MainDTO main;
    private int visibility;
    private WindDTO wind;
    private CloudsDTO clouds;
    private long dt;
    private SysDTO sys;
    private long id;
    private String name;
    private int cod;
}

@Data
@NoArgsConstructor
class CoordDTO {

    private double lon;
    private double lat;
}

@Data
@NoArgsConstructor
class WeatherDTO {

    private int id;
    private String main;
    private String description;
    private String icon;
}

@Data
@NoArgsConstructor
class MainDTO {

    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;
}

@Data
@NoArgsConstructor
class WindDTO {

    private double speed;
    private int deg;
}

@Data
@NoArgsConstructor
class CloudsDTO {

    private int all;
}

@Data
@NoArgsConstructor
class SysDTO {

    private int type;
    private int id;
    private double message;
    private String country;
    private long sunrise;
    private long sunset;
}
