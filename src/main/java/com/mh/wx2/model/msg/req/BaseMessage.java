package com.mh.wx2.model.msg.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 消息基类（用户 -> 公众帐号）
 *
 */
@Getter
@Setter
@ToString
public class BaseMessage {
    /**
     * 开发者微信号
     */
    private String ToUserName;
    /**
     * 发送方帐号（一个OpenID）
     */
    private String FromUserName;
    /**
     * 消息创建时间 （整型）
     */
    private long CreateTime;

    /**
     * 消息类型 text、image、location、link
     */
    private String MsgType;

    /**
     * 消息id，64位整型
     */
    private long MsgId;



}
