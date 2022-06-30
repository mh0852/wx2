package com.mh.wx2.model.msg.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VoiceMessage extends BaseMessage{
    /**
     * 媒体ID
     */
    private String MediaId;
    /**
     * 语音格式
     */
    private String Format;
}
