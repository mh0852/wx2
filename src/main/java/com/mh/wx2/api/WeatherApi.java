package com.mh.wx2.api;

import com.mh.wx2.model.weather.WeatherDto;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApi {

    public static Logger log = Logger.getLogger(WeatherApi.class);

    final static String SOJSON_WEATHER_URL = "http://t.weather.itboy.net/api/weather/city/{1}";
    /**
     * 获取数据
     * @param id
     * @return
     */
//    @Cacheable(cacheNames = "weather_cache", key = "#id")// 从缓存获取，key为ID，缓存具体看 ehcache.xml 配置文件
    public WeatherDto getById(String id) {
        log.info("WeatherManager#getById: id=" + id);
        try {
            RestTemplate restTemplate = new RestTemplate();
            WeatherDto dto = restTemplate.getForObject(SOJSON_WEATHER_URL , WeatherDto.class,id);
            log.info(dto.toString());
            if(dto != null && dto.getStatus() == 200){
                return dto;
            }else{
                log.error("获取天气数据返回错误：" + dto);
            }
        } catch (RestClientException e) {
            log.error("获取天气数据返回错误，出现异常.", e);
        }
        return null;
    }
}
