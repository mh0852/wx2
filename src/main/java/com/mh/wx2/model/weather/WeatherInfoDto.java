package com.mh.wx2.model.weather;


import java.io.Serializable;

@lombok.Data
public class WeatherInfoDto implements Serializable {

    /**
     * showapi_res_error :
     * showapi_res_id : 62b5725f0de3760061e48504
     * showapi_res_code : 0
     * showapi_fee_num : 1
     * showapi_res_body : {"ret_code":0,"remark":"查询成功!","cityInfo":{"c16":"AZ9352","c11":"0352","latitude":40.06,"c1":"101100201","c6":"shanxi","c9":"中国","c2":"datong","c5":"大同","c17":"+8","c15":"1069","c10":"2","c12":"037000","c7":"山西","c8":"china","longitude":113.17,"c3":"大同","c4":"datong"},"f1":{"night_weather_code":"00","day_weather":"晴","night_weather":"晴","index":{"yh":{"title":"较适宜","desc":"不用担心天气来调皮捣乱而影响了兴致。 "},"ls":{"title":"较适宜","desc":"请在室外通风的地方晾晒。"},"clothes":{"title":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},"dy":{"title":"不适宜钓鱼","desc":"天气太热,不适宜垂钓。"},"sports":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"travel":{"title":"较不宜","desc":"天气很热，如外出可选择水上娱乐项目。"},"beauty":{"title":"去油","desc":"请选用露质面霜打底，水质无油粉底霜。"},"xq":{"title":"较差","desc":"天气热，容易烦躁"},"hc":{"title":"较适宜","desc":"风大，需注意及时添衣。"},"zs":{"title":"可能中暑","desc":"气温较高，易中暑人群注意阴凉休息。"},"cold":{"title":"极易发","desc":"昼夜温差极大，极易感冒。"},"gj":{"title":"较适宜","desc":"风稍大，出门逛街前记得给秀发定型。"},"uv":{"title":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},"comfort":{"title":"较差","desc":"热，感觉不舒适"},"cl":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"wash_car":{"title":"适宜","desc":"无雨且风力较小，易保持清洁度。"},"ac":{"title":"适宜","desc":"适宜时段在下午2点至傍晚5点"},"aqi":{"title":"优质","desc":"空气很好，可以外出活动，呼吸新鲜空气"},"glass":{"title":"很必要","desc":"很必要佩戴"},"mf":{"title":"暂缺","desc":"暂缺"},"ag":{"title":"暂缺","desc":"暂缺"},"nl":{"title":"暂缺","desc":"暂缺"},"pj":{"title":"适宜","desc":"炎热干燥，适宜饮用冰镇啤酒，不要贪杯。"},"pk":{"title":"不宜","desc":"天气酷热，不适宜放风筝。"}},"jiangshui":"0%","air_press":"873hPa","night_wind_power":"0-3级 <5.4m/s","day_wind_power":"3-4级 5.5~7.9m/s","day_weather_code":"00","sun_begin_end":"04:58|19:59","ziwaixian":"很强","day_weather_pic":"http://app1.showapi.com/weather/icon/day/00.png","weekday":5,"night_air_temperature":"13","day_wind_direction":"西风","day_air_temperature":"33","night_wind_direction":"西南风","night_weather_pic":"http://app1.showapi.com/weather/icon/night/00.png","day":"20220624"},"date":"20220624"}
     */

    private String showapi_res_error;
    private String showapi_res_id;
    private int showapi_res_code;
    private int showapi_fee_num;
    private ShowapiResBodyBean showapi_res_body;

    @lombok.Data
    public static class ShowapiResBodyBean implements Serializable {
        /**
         * ret_code : 0
         * remark : 查询成功!
         * cityInfo : {"c16":"AZ9352","c11":"0352","latitude":40.06,"c1":"101100201","c6":"shanxi","c9":"中国","c2":"datong","c5":"大同","c17":"+8","c15":"1069","c10":"2","c12":"037000","c7":"山西","c8":"china","longitude":113.17,"c3":"大同","c4":"datong"}
         * f1 : {"night_weather_code":"00","day_weather":"晴","night_weather":"晴","index":{"yh":{"title":"较适宜","desc":"不用担心天气来调皮捣乱而影响了兴致。 "},"ls":{"title":"较适宜","desc":"请在室外通风的地方晾晒。"},"clothes":{"title":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},"dy":{"title":"不适宜钓鱼","desc":"天气太热,不适宜垂钓。"},"sports":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"travel":{"title":"较不宜","desc":"天气很热，如外出可选择水上娱乐项目。"},"beauty":{"title":"去油","desc":"请选用露质面霜打底，水质无油粉底霜。"},"xq":{"title":"较差","desc":"天气热，容易烦躁"},"hc":{"title":"较适宜","desc":"风大，需注意及时添衣。"},"zs":{"title":"可能中暑","desc":"气温较高，易中暑人群注意阴凉休息。"},"cold":{"title":"极易发","desc":"昼夜温差极大，极易感冒。"},"gj":{"title":"较适宜","desc":"风稍大，出门逛街前记得给秀发定型。"},"uv":{"title":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},"comfort":{"title":"较差","desc":"热，感觉不舒适"},"cl":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"wash_car":{"title":"适宜","desc":"无雨且风力较小，易保持清洁度。"},"ac":{"title":"适宜","desc":"适宜时段在下午2点至傍晚5点"},"aqi":{"title":"优质","desc":"空气很好，可以外出活动，呼吸新鲜空气"},"glass":{"title":"很必要","desc":"很必要佩戴"},"mf":{"title":"暂缺","desc":"暂缺"},"ag":{"title":"暂缺","desc":"暂缺"},"nl":{"title":"暂缺","desc":"暂缺"},"pj":{"title":"适宜","desc":"炎热干燥，适宜饮用冰镇啤酒，不要贪杯。"},"pk":{"title":"不宜","desc":"天气酷热，不适宜放风筝。"}},"jiangshui":"0%","air_press":"873hPa","night_wind_power":"0-3级 <5.4m/s","day_wind_power":"3-4级 5.5~7.9m/s","day_weather_code":"00","sun_begin_end":"04:58|19:59","ziwaixian":"很强","day_weather_pic":"http://app1.showapi.com/weather/icon/day/00.png","weekday":5,"night_air_temperature":"13","day_wind_direction":"西风","day_air_temperature":"33","night_wind_direction":"西南风","night_weather_pic":"http://app1.showapi.com/weather/icon/night/00.png","day":"20220624"}
         * date : 20220624
         */

        private int ret_code;
        private String remark;
        private CityInfoBean cityInfo;
        private F1Bean f1;
        private String date;

        @lombok.Data
        public static class CityInfoBean implements Serializable {
            /**
             * c16 : AZ9352
             * c11 : 0352
             * latitude : 40.06
             * c1 : 101100201
             * c6 : shanxi
             * c9 : 中国
             * c2 : datong
             * c5 : 大同
             * c17 : +8
             * c15 : 1069
             * c10 : 2
             * c12 : 037000
             * c7 : 山西
             * c8 : china
             * longitude : 113.17
             * c3 : 大同
             * c4 : datong
             */

            private String c16;
            private String c11;
            private double latitude;
            private String c1;
            private String c6;
            private String c9;
            private String c2;
            private String c5;
            private String c17;
            private String c15;
            private String c10;
            private String c12;
            private String c7;
            private String c8;
            private double longitude;
            private String c3;
            private String c4;
        }

        @lombok.Data
        public static class F1Bean implements Serializable {
            /**
             * night_weather_code : 00
             * day_weather : 晴
             * night_weather : 晴
             * index : {"yh":{"title":"较适宜","desc":"不用担心天气来调皮捣乱而影响了兴致。 "},"ls":{"title":"较适宜","desc":"请在室外通风的地方晾晒。"},"clothes":{"title":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},"dy":{"title":"不适宜钓鱼","desc":"天气太热,不适宜垂钓。"},"sports":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"travel":{"title":"较不宜","desc":"天气很热，如外出可选择水上娱乐项目。"},"beauty":{"title":"去油","desc":"请选用露质面霜打底，水质无油粉底霜。"},"xq":{"title":"较差","desc":"天气热，容易烦躁"},"hc":{"title":"较适宜","desc":"风大，需注意及时添衣。"},"zs":{"title":"可能中暑","desc":"气温较高，易中暑人群注意阴凉休息。"},"cold":{"title":"极易发","desc":"昼夜温差极大，极易感冒。"},"gj":{"title":"较适宜","desc":"风稍大，出门逛街前记得给秀发定型。"},"uv":{"title":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"},"comfort":{"title":"较差","desc":"热，感觉不舒适"},"cl":{"title":"较不宜","desc":"天气炎热，建议停止户外运动。"},"wash_car":{"title":"适宜","desc":"无雨且风力较小，易保持清洁度。"},"ac":{"title":"适宜","desc":"适宜时段在下午2点至傍晚5点"},"aqi":{"title":"优质","desc":"空气很好，可以外出活动，呼吸新鲜空气"},"glass":{"title":"很必要","desc":"很必要佩戴"},"mf":{"title":"暂缺","desc":"暂缺"},"ag":{"title":"暂缺","desc":"暂缺"},"nl":{"title":"暂缺","desc":"暂缺"},"pj":{"title":"适宜","desc":"炎热干燥，适宜饮用冰镇啤酒，不要贪杯。"},"pk":{"title":"不宜","desc":"天气酷热，不适宜放风筝。"}}
             * jiangshui : 0%
             * air_press : 873hPa
             * night_wind_power : 0-3级 <5.4m/s
             * day_wind_power : 3-4级 5.5~7.9m/s
             * day_weather_code : 00
             * sun_begin_end : 04:58|19:59
             * ziwaixian : 很强
             * day_weather_pic : http://app1.showapi.com/weather/icon/day/00.png
             * weekday : 5
             * night_air_temperature : 13
             * day_wind_direction : 西风
             * day_air_temperature : 33
             * night_wind_direction : 西南风
             * night_weather_pic : http://app1.showapi.com/weather/icon/night/00.png
             * day : 20220624
             */

            private String night_weather_code;
            private String day_weather;
            private String night_weather;
            private IndexBean index;
            private String jiangshui;
            private String air_press;
            private String night_wind_power;
            private String day_wind_power;
            private String day_weather_code;
            private String sun_begin_end;
            private String ziwaixian;
            private String day_weather_pic;
            private int weekday;
            private String night_air_temperature;
            private String day_wind_direction;
            private String day_air_temperature;
            private String night_wind_direction;
            private String night_weather_pic;
            private String day;

            @lombok.Data
            public static class IndexBean implements Serializable {
                /**
                 * yh : {"title":"较适宜","desc":"不用担心天气来调皮捣乱而影响了兴致。 "}
                 * ls : {"title":"较适宜","desc":"请在室外通风的地方晾晒。"}
                 * clothes : {"title":"热","desc":"适合穿T恤、短薄外套等夏季服装。"}
                 * dy : {"title":"不适宜钓鱼","desc":"天气太热,不适宜垂钓。"}
                 * sports : {"title":"较不宜","desc":"天气炎热，建议停止户外运动。"}
                 * travel : {"title":"较不宜","desc":"天气很热，如外出可选择水上娱乐项目。"}
                 * beauty : {"title":"去油","desc":"请选用露质面霜打底，水质无油粉底霜。"}
                 * xq : {"title":"较差","desc":"天气热，容易烦躁"}
                 * hc : {"title":"较适宜","desc":"风大，需注意及时添衣。"}
                 * zs : {"title":"可能中暑","desc":"气温较高，易中暑人群注意阴凉休息。"}
                 * cold : {"title":"极易发","desc":"昼夜温差极大，极易感冒。"}
                 * gj : {"title":"较适宜","desc":"风稍大，出门逛街前记得给秀发定型。"}
                 * uv : {"title":"很强","desc":"涂擦SPF20以上，PA++护肤品，避强光。"}
                 * comfort : {"title":"较差","desc":"热，感觉不舒适"}
                 * cl : {"title":"较不宜","desc":"天气炎热，建议停止户外运动。"}
                 * wash_car : {"title":"适宜","desc":"无雨且风力较小，易保持清洁度。"}
                 * ac : {"title":"适宜","desc":"适宜时段在下午2点至傍晚5点"}
                 * aqi : {"title":"优质","desc":"空气很好，可以外出活动，呼吸新鲜空气"}
                 * glass : {"title":"很必要","desc":"很必要佩戴"}
                 * mf : {"title":"暂缺","desc":"暂缺"}
                 * ag : {"title":"暂缺","desc":"暂缺"}
                 * nl : {"title":"暂缺","desc":"暂缺"}
                 * pj : {"title":"适宜","desc":"炎热干燥，适宜饮用冰镇啤酒，不要贪杯。"}
                 * pk : {"title":"不宜","desc":"天气酷热，不适宜放风筝。"}
                 */

                private YhBean yh;
                private LsBean ls;
                private ClothesBean clothes;
                private DyBean dy;
                private SportsBean sports;
                private TravelBean travel;
                private BeautyBean beauty;
                private XqBean xq;
                private HcBean hc;
                private ZsBean zs;
                private ColdBean cold;
                private GjBean gj;
                private UvBean uv;
                private ComfortBean comfort;
                private ClBean cl;
                private WashCarBean wash_car;
                private AcBean ac;
                private AqiBean aqi;
                private GlassBean glass;
                private MfBean mf;
                private AgBean ag;
                private NlBean nl;
                private PjBean pj;
                private PkBean pk;

                @lombok.Data
                public static class YhBean implements Serializable {
                    /**
                     * title : 较适宜
                     * desc : 不用担心天气来调皮捣乱而影响了兴致。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class LsBean implements Serializable {
                    /**
                     * title : 较适宜
                     * desc : 请在室外通风的地方晾晒。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class ClothesBean implements Serializable {
                    /**
                     * title : 热
                     * desc : 适合穿T恤、短薄外套等夏季服装。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class DyBean implements Serializable {
                    /**
                     * title : 不适宜钓鱼
                     * desc : 天气太热,不适宜垂钓。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class SportsBean implements Serializable {
                    /**
                     * title : 较不宜
                     * desc : 天气炎热，建议停止户外运动。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class TravelBean implements Serializable {
                    /**
                     * title : 较不宜
                     * desc : 天气很热，如外出可选择水上娱乐项目。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class BeautyBean implements Serializable {
                    /**
                     * title : 去油
                     * desc : 请选用露质面霜打底，水质无油粉底霜。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class XqBean implements Serializable {
                    /**
                     * title : 较差
                     * desc : 天气热，容易烦躁
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class HcBean implements Serializable {
                    /**
                     * title : 较适宜
                     * desc : 风大，需注意及时添衣。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class ZsBean implements Serializable {
                    /**
                     * title : 可能中暑
                     * desc : 气温较高，易中暑人群注意阴凉休息。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class ColdBean implements Serializable {
                    /**
                     * title : 极易发
                     * desc : 昼夜温差极大，极易感冒。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class GjBean implements Serializable {
                    /**
                     * title : 较适宜
                     * desc : 风稍大，出门逛街前记得给秀发定型。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class UvBean implements Serializable {
                    /**
                     * title : 很强
                     * desc : 涂擦SPF20以上，PA++护肤品，避强光。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class ComfortBean implements Serializable {
                    /**
                     * title : 较差
                     * desc : 热，感觉不舒适
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class ClBean implements Serializable {
                    /**
                     * title : 较不宜
                     * desc : 天气炎热，建议停止户外运动。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class WashCarBean implements Serializable {
                    /**
                     * title : 适宜
                     * desc : 无雨且风力较小，易保持清洁度。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class AcBean implements Serializable {
                    /**
                     * title : 适宜
                     * desc : 适宜时段在下午2点至傍晚5点
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class AqiBean implements Serializable {
                    /**
                     * title : 优质
                     * desc : 空气很好，可以外出活动，呼吸新鲜空气
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class GlassBean implements Serializable {
                    /**
                     * title : 很必要
                     * desc : 很必要佩戴
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class MfBean implements Serializable {
                    /**
                     * title : 暂缺
                     * desc : 暂缺
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class AgBean implements Serializable {
                    /**
                     * title : 暂缺
                     * desc : 暂缺
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class NlBean implements Serializable {
                    /**
                     * title : 暂缺
                     * desc : 暂缺
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class PjBean implements Serializable {
                    /**
                     * title : 适宜
                     * desc : 炎热干燥，适宜饮用冰镇啤酒，不要贪杯。
                     */

                    private String title;
                    private String desc;
                }

                @lombok.Data
                public static class PkBean implements Serializable {
                    /**
                     * title : 不宜
                     * desc : 天气酷热，不适宜放风筝。
                     */

                    private String title;
                    private String desc;
                }
            }
        }
    }
}