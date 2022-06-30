package com.mh.wx2.model.weather;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WeatherDto implements Serializable {

    /**
     * message : success感谢又拍云(upyun.com)提供CDN赞助
     * status : 200
     * date : 20220629
     * time : 2022-06-29 14:03:45
     * cityInfo : {"city":"浦东新区","citykey":"101020600","parent":"上海市","updateTime":"10:46"}
     * data : {"shidu":"62%","pm25":18,"pm10":30,"quality":"优","wendu":"37","ganmao":"各类人群可自由活动","forecast":[{"date":"29","high":"高温 34℃","low":"低温 27℃","ymd":"2022-06-29","week":"星期三","sunrise":"04:52","sunset":"19:02","aqi":31,"fx":"南风","fl":"3级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"30","high":"高温 32℃","low":"低温 27℃","ymd":"2022-06-30","week":"星期四","sunrise":"04:53","sunset":"19:02","aqi":28,"fx":"南风","fl":"4级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"01","high":"高温 31℃","low":"低温 27℃","ymd":"2022-07-01","week":"星期五","sunrise":"04:53","sunset":"19:02","aqi":16,"fx":"东南风","fl":"4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"02","high":"高温 32℃","low":"低温 26℃","ymd":"2022-07-02","week":"星期六","sunrise":"04:54","sunset":"19:02","aqi":18,"fx":"东风","fl":"3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"03","high":"高温 31℃","low":"低温 26℃","ymd":"2022-07-03","week":"星期日","sunrise":"04:54","sunset":"19:01","aqi":20,"fx":"东北风","fl":"3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"04","high":"高温 31℃","low":"低温 27℃","ymd":"2022-07-04","week":"星期一","sunrise":"04:54","sunset":"19:01","aqi":33,"fx":"北风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"05","high":"高温 33℃","low":"低温 26℃","ymd":"2022-07-05","week":"星期二","sunrise":"04:55","sunset":"19:01","aqi":51,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"06","high":"高温 34℃","low":"低温 26℃","ymd":"2022-07-06","week":"星期三","sunrise":"04:55","sunset":"19:01","aqi":43,"fx":"东南风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","high":"高温 35℃","low":"低温 25℃","ymd":"2022-07-07","week":"星期四","sunrise":"04:56","sunset":"19:01","aqi":29,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"08","high":"高温 32℃","low":"低温 24℃","ymd":"2022-07-08","week":"星期五","sunrise":"04:56","sunset":"19:01","aqi":28,"fx":"东北风","fl":"3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"09","high":"高温 33℃","low":"低温 25℃","ymd":"2022-07-09","week":"星期六","sunrise":"04:57","sunset":"19:01","aqi":26,"fx":"北风","fl":"2级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"10","high":"高温 33℃","low":"低温 24℃","ymd":"2022-07-10","week":"星期日","sunrise":"04:57","sunset":"19:00","aqi":42,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","high":"高温 34℃","low":"低温 24℃","ymd":"2022-07-11","week":"星期一","sunrise":"04:58","sunset":"19:00","aqi":41,"fx":"东南风","fl":"2级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","high":"高温 35℃","low":"低温 25℃","ymd":"2022-07-12","week":"星期二","sunrise":"04:58","sunset":"19:00","aqi":19,"fx":"东风","fl":"4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"13","high":"高温 34℃","low":"低温 24℃","ymd":"2022-07-13","week":"星期三","sunrise":"04:59","sunset":"19:00","aqi":22,"fx":"东风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"}],"yesterday":{"date":"28","high":"高温 35℃","low":"低温 26℃","ymd":"2022-06-28","week":"星期二","sunrise":"04:52","sunset":"19:01","aqi":25,"fx":"南风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"}}
     */

    private String message;
    private int status;
    private String date;
    private String time;
    private CityInfoBean cityInfo;
    private DataBean data;

    @Data
    public static class CityInfoBean implements Serializable {
        /**
         * city : 浦东新区
         * citykey : 101020600
         * parent : 上海市
         * updateTime : 10:46
         */

        private String city;
        private String citykey;
        private String parent;
        private String updateTime;
    }

    @Data
    public static class DataBean implements Serializable {
        /**
         * shidu : 62%
         * pm25 : 18
         * pm10 : 30
         * quality : 优
         * wendu : 37
         * ganmao : 各类人群可自由活动
         * forecast : [{"date":"29","high":"高温 34℃","low":"低温 27℃","ymd":"2022-06-29","week":"星期三","sunrise":"04:52","sunset":"19:02","aqi":31,"fx":"南风","fl":"3级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"30","high":"高温 32℃","low":"低温 27℃","ymd":"2022-06-30","week":"星期四","sunrise":"04:53","sunset":"19:02","aqi":28,"fx":"南风","fl":"4级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"01","high":"高温 31℃","low":"低温 27℃","ymd":"2022-07-01","week":"星期五","sunrise":"04:53","sunset":"19:02","aqi":16,"fx":"东南风","fl":"4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"02","high":"高温 32℃","low":"低温 26℃","ymd":"2022-07-02","week":"星期六","sunrise":"04:54","sunset":"19:02","aqi":18,"fx":"东风","fl":"3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"03","high":"高温 31℃","low":"低温 26℃","ymd":"2022-07-03","week":"星期日","sunrise":"04:54","sunset":"19:01","aqi":20,"fx":"东北风","fl":"3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"04","high":"高温 31℃","low":"低温 27℃","ymd":"2022-07-04","week":"星期一","sunrise":"04:54","sunset":"19:01","aqi":33,"fx":"北风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"05","high":"高温 33℃","low":"低温 26℃","ymd":"2022-07-05","week":"星期二","sunrise":"04:55","sunset":"19:01","aqi":51,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"06","high":"高温 34℃","low":"低温 26℃","ymd":"2022-07-06","week":"星期三","sunrise":"04:55","sunset":"19:01","aqi":43,"fx":"东南风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","high":"高温 35℃","low":"低温 25℃","ymd":"2022-07-07","week":"星期四","sunrise":"04:56","sunset":"19:01","aqi":29,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"08","high":"高温 32℃","low":"低温 24℃","ymd":"2022-07-08","week":"星期五","sunrise":"04:56","sunset":"19:01","aqi":28,"fx":"东北风","fl":"3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"09","high":"高温 33℃","low":"低温 25℃","ymd":"2022-07-09","week":"星期六","sunrise":"04:57","sunset":"19:01","aqi":26,"fx":"北风","fl":"2级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"10","high":"高温 33℃","low":"低温 24℃","ymd":"2022-07-10","week":"星期日","sunrise":"04:57","sunset":"19:00","aqi":42,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","high":"高温 34℃","low":"低温 24℃","ymd":"2022-07-11","week":"星期一","sunrise":"04:58","sunset":"19:00","aqi":41,"fx":"东南风","fl":"2级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","high":"高温 35℃","low":"低温 25℃","ymd":"2022-07-12","week":"星期二","sunrise":"04:58","sunset":"19:00","aqi":19,"fx":"东风","fl":"4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"13","high":"高温 34℃","low":"低温 24℃","ymd":"2022-07-13","week":"星期三","sunrise":"04:59","sunset":"19:00","aqi":22,"fx":"东风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"}]
         * yesterday : {"date":"28","high":"高温 35℃","low":"低温 26℃","ymd":"2022-06-28","week":"星期二","sunrise":"04:52","sunset":"19:01","aqi":25,"fx":"南风","fl":"3级","type":"阴","notice":"不要被阴云遮挡住好心情"}
         */

        private String shidu;
        private int pm25;
        private int pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        @Data
        public static class YesterdayBean implements Serializable {
            /**
             * date : 28
             * high : 高温 35℃
             * low : 低温 26℃
             * ymd : 2022-06-28
             * week : 星期二
             * sunrise : 04:52
             * sunset : 19:01
             * aqi : 25
             * fx : 南风
             * fl : 3级
             * type : 阴
             * notice : 不要被阴云遮挡住好心情
             */

            private String date;
            private String high;
            private String low;
            private String ymd;
            private String week;
            private String sunrise;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;
        }

        @Data
        public static class ForecastBean implements Serializable {
            /**
             * date : 29
             * high : 高温 34℃
             * low : 低温 27℃
             * ymd : 2022-06-29
             * week : 星期三
             * sunrise : 04:52
             * sunset : 19:02
             * aqi : 31
             * fx : 南风
             * fl : 3级
             * type : 中雨
             * notice : 记得随身携带雨伞哦
             */

            private String date;
            private String high;
            private String low;
            private String ymd;
            private String week;
            private String sunrise;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;
        }
    }
}
