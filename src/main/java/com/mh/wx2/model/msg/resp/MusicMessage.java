package com.mh.wx2.model.msg.resp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 音乐消息
 */
@Getter
@Setter
@ToString
public class MusicMessage extends BaseMessage {
    /**
     * 音乐
     */
    private Music Music;

}