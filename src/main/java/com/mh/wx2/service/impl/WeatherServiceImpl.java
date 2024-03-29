package com.mh.wx2.service.impl;

import com.mh.wx2.constant.Constant;
import com.mh.wx2.mapper.WeatherMapper;
import com.mh.wx2.model.weather.CityCode;
import com.mh.wx2.model.weather.WeatherInfoModel;
import com.mh.wx2.service.WeatherService;
import com.mh.wx2.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherMapper weatherMapper;

    public void insert() throws IOException {


        System.out.println(Constant.WEATHER_AREA_CODE);

        BufferedReader reader = null;
        String laststr = "";
        FileInputStream fileInputStream = new FileInputStream(Constant.WEATHER_AREA_CODE);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        reader = new BufferedReader(inputStreamReader);
        String tempString = null;
        while((tempString = reader.readLine()) != null){
            laststr += tempString;
            laststr +="\n";
        }
        reader.close();
        System.out.println(laststr);
        List list = JsonUtils.jsonToList(laststr, CityCode.class);

        System.out.println(list.size());
        Iterator<CityCode> cityCode = list.iterator();
        while (cityCode.hasNext()){
            weatherMapper.insertWeatherCode(cityCode.next());
        }

    }

    @Override
    public String selectWeatherCode(String cityname) {
        return weatherMapper.selectWeatherCode(cityname);
    }

    @Override
    public List<String> selectAllWeatherCode() {
        return weatherMapper.selectAllWeatherCode();
    }

    @Override
    public void insertWeatherInfo(WeatherInfoModel weatherInfoModel) throws IOException {
        weatherMapper.insertWeatherInfo(weatherInfoModel);
    }
}
