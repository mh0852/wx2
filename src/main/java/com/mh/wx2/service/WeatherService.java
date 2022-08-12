package com.mh.wx2.service;

import com.mh.wx2.model.weather.WeatherInfoModel;

import java.io.IOException;
import java.util.List;

public interface WeatherService {
    void insert() throws IOException;
    String selectWeatherCode(String cityname);
    List<String> selectAllWeatherCode();
    void insertWeatherInfo(WeatherInfoModel weatherInfoModel) throws IOException;
}
