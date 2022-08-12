package com.mh.wx2.mapper;

import com.mh.wx2.model.weather.CityCode;
import com.mh.wx2.model.weather.WeatherInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WeatherMapper {


    Integer insertWeatherCode(CityCode cityCode);

    String selectWeatherCode(String cityname);

    List<String> selectAllWeatherCode();

    Integer insertWeatherInfo(WeatherInfoModel weatherInfoModel);
}
