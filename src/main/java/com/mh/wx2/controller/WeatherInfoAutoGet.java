package com.mh.wx2.controller;

import com.mh.wx2.api.WeatherApi;
import com.mh.wx2.model.weather.WeatherDto;
import com.mh.wx2.model.weather.WeatherInfoModel;
import com.mh.wx2.service.WeatherService;
import com.mh.wx2.utils.ThreadPoolExecutorUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

@Component
public class WeatherInfoAutoGet {
    public static Logger log = Logger.getLogger(WeatherInfoAutoGet.class);

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherApi weatherApi;

    //@Scheduled(cron = "0 * * * * *")
    public void autoGetWeather() throws IOException {

        ExecutorService threadPoolWeather = ThreadPoolExecutorUtil.getThreadPool1();

        List<String> cityCodes = weatherService.selectAllWeatherCode();

        for (int i = 0; i <=cityCodes.size() -1 ; i++){

            int num = i;
            threadPoolWeather.execute(
                    new Thread(()->{
                        try{
                            WeatherDto info = weatherApi.getById(cityCodes.get(num));

                            WeatherInfoModel weatherInfoModel = new WeatherInfoModel();
                            weatherInfoModel.setFdate(info.getDate());
                            weatherInfoModel.setFtime(info.getTime());
                            weatherInfoModel.setCity(info.getCityInfo().getCity());
                            weatherInfoModel.setCitykey(Integer.parseInt(info.getCityInfo().getCitykey()));
                            weatherInfoModel.setParent(info.getCityInfo().getParent());
                            weatherInfoModel.setUpdateTime(info.getCityInfo().getUpdateTime());
                            weatherInfoModel.setShidu(info.getData().getShidu());
                            weatherInfoModel.setPm25(String.valueOf(info.getData().getPm25()));
                            weatherInfoModel.setPm10(String.valueOf(info.getData().getPm10()));
                            weatherInfoModel.setQuality(info.getData().getQuality());
                            weatherInfoModel.setWendu(info.getData().getWendu());
                            weatherInfoModel.setGanmao(info.getData().getGanmao());
                            weatherInfoModel.setHigh(info.getData().getForecast().get(0).getHigh());
                            weatherInfoModel.setLow(info.getData().getForecast().get(0).getLow());
                            weatherInfoModel.setYmd(info.getData().getForecast().get(0).getYmd());
                            weatherInfoModel.setWeek(info.getData().getForecast().get(0).getWeek());
                            weatherInfoModel.setSunrise(info.getData().getForecast().get(0).getSunrise());
                            weatherInfoModel.setSunset(info.getData().getForecast().get(0).getSunset());
                            weatherInfoModel.setAqi(String.valueOf(info.getData().getForecast().get(0).getAqi()));
                            weatherInfoModel.setFx(String.valueOf(info.getData().getForecast().get(0).getFx()));
                            weatherInfoModel.setFl(String.valueOf(info.getData().getForecast().get(0).getFl()));
                            weatherInfoModel.setType(String.valueOf(info.getData().getForecast().get(0).getType()));
                            weatherInfoModel.setNotice(String.valueOf(info.getData().getForecast().get(0).getNotice()));

                            weatherService.insertWeatherInfo(weatherInfoModel);

                            Thread.sleep(3000);

                        }catch (Exception e){
                            e.printStackTrace();
                            log.error(cityCodes.get(num) + "插入报错啦" + e);
                        }

//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }
            )
            );
        }


    }

}
