package com.mh.wx2.mapper;


import com.mh.wx2.model.tencentsharesinfo.BriefInfoMsg;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TencentSharesMapper {

    Integer insertBriefInfo(BriefInfoMsg briefInfoMsg);


    List getSharesCodes();
}
