package com.mh.wx2.service.impl;

import com.mh.wx2.api.WeatherApi;
import com.mh.wx2.constant.Constant;
import com.mh.wx2.model.msg.resp.TextMessage;
import com.mh.wx2.model.weather.WeatherDto;
import com.mh.wx2.service.CoreService;
import com.mh.wx2.service.WeatherService;
import com.mh.wx2.utils.MessageUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@Service
public class CoreServiceImpl implements CoreService {
    public static Logger log = Logger.getLogger(CoreServiceImpl.class);

    @Autowired
    private WeatherApi weatherApi;

    @Autowired
    private WeatherService weatherService;


    @Override
    public String processRequest(HttpServletRequest request) {
        String respMessage = null;
        try {
            // xml请求解析
            Map<String, String> requestMap = MessageUtil.parseXml(request);
            log.info(requestMap.toString());

            // 发送方帐号（open_id）
            String fromUserName = requestMap.get("FromUserName");
            // 公众帐号
            String toUserName = requestMap.get("ToUserName");
            // 消息类型
            String msgType = requestMap.get("MsgType");

            TextMessage textMessage = new TextMessage();
            textMessage.setToUserName(fromUserName);
            textMessage.setFromUserName(toUserName);
            textMessage.setCreateTime(new Date().getTime());
            textMessage.setMsgType(Constant.RESP_MESSAGE_TYPE_TEXT);
            textMessage.setFuncFlag(0);
            // 文本消息
            if (msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)) {
                // 接收用户发送的文本消息内容
                String content = requestMap.get("Content");

                //天气城市码值导入数据库
//                importcode.insert();

                String city_code = weatherService.selectWeatherCode(content);
                WeatherDto weatherDto = weatherApi.getById(city_code);
                if(weatherDto != null){
                    String weather_string = weatherDto.getCityInfo().getCity()
                    + "\n更新时间："+ weatherDto.getCityInfo().getUpdateTime()
                        +"\n天气状况：" + weatherDto.getData().getForecast().get(0).getType()
                            + " " + weatherDto.getData().getQuality()
                            + "\n温度：" + weatherDto.getData().getWendu()
                            + "\n最高温度：" + weatherDto.getData().getForecast().get(0).getHigh()
                            + "\n最低温度：" + weatherDto.getData().getForecast().get(0).getLow()
                            + "\n湿度：" + weatherDto.getData().getShidu()
                            + "\nPM2.5：" + weatherDto.getData().getPm25()
                            + "\nPM10："+ weatherDto.getData().getPm10()
                            + "\n日出：" + weatherDto.getData().getForecast().get(0).getSunrise()
                            + "\n日落：" + weatherDto.getData().getForecast().get(0).getSunset()
                            + "\n风向风力：" + weatherDto.getData().getForecast().get(0).getFx()+weatherDto.getData().getForecast().get(0).getFl()
                            + "\n感冒提醒：" + weatherDto.getData().getGanmao()
                            + "\n温馨提示：" + weatherDto.getData().getForecast().get(0).getNotice();

                    //拼接信息
//                    weatherDto.get

                    textMessage.setContent(weather_string);
                    respMessage = MessageUtil.textMessageToXml(textMessage);
                }else{

                }


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return respMessage;
    }
}
