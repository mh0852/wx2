package com.mh.wx2.service;

import java.io.IOException;

public interface WeatherCodeService {
    void insert() throws IOException;
    String selectWeatherCode(String cityname);
}
