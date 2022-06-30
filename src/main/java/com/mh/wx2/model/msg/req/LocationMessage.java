package com.mh.wx2.model.msg.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocationMessage extends BaseMessage{
    /**
     * 地理位置维度
     */
    private String Location_X;
    /**
     * 地理位置经度
     */
    private String Location_Y;

    /**
     * 地图缩放大小
     */
    private String Scale;

    /**
     * 地理位置信息
     */
    private String Label;
}
