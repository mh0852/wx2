package com.mh.wx2.model.msg.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImageMessage  extends BaseMessage{
    private String PicUrl;
    private String MediaId;
}
