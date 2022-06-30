package com.mh.wx2.mapper;

import com.mh.wx2.model.weather.CityCode;
import org.springframework.stereotype.Component;

@Component
public interface WeatherCodeMapper {


    Integer insertWeatherCode(CityCode cityCode);

    String selectWeatherCode(String cityname);

}
