package com.mh.wx2.model.msg.resp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文本消息
 */
@Getter
@Setter
@ToString
public class TextMessage extends BaseMessage {
    /**
     * 回复的消息内容
     */
    private String Content;

}