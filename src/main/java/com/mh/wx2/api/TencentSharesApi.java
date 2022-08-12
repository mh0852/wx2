package com.mh.wx2.api;

import com.mh.wx2.mapper.TencentSharesMapper;
import com.mh.wx2.model.tencentsharesinfo.BriefInfoMsg;
import com.mh.wx2.utils.HttpClientUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TencentSharesApi {

    public static Logger log = Logger.getLogger(TencentSharesApi.class);

    final static String CURRENT_MARKET_URL = "http://qt.gtimg.cn/q=s_";

    @Autowired
    private TencentSharesMapper tencentSharesMapper;

    public BriefInfoMsg getBySharesCode(String code) {
        log.info("#getBySharesCode: code=" + code);
        try {
            String url_q=CURRENT_MARKET_URL+code;
            String srcString = HttpClientUtil.doGet(url_q);
            String[] strs = srcString.split("\"");//根据"切分字符串
            String s1 = strs[1];
            String[] s1Strs = s1.split("~");//根据~切分字符串

            BriefInfoMsg briefInfoMsg = new BriefInfoMsg();

            briefInfoMsg.setSharesName(s1Strs[1]);
            briefInfoMsg.setSharesCode(s1Strs[2]);
            briefInfoMsg.setCurrPrice(s1Strs[3]);
            briefInfoMsg.setRiseFall(s1Strs[4]);
            briefInfoMsg.setRiseFallPercent(s1Strs[5]);
            briefInfoMsg.setTradeAmount(s1Strs[6]);
            briefInfoMsg.setTradeSumPrice(s1Strs[7]);
            briefInfoMsg.setMarketCap(s1Strs[9]);
            briefInfoMsg.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
            briefInfoMsg.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
            log.info(briefInfoMsg.toString());

            tencentSharesMapper.insertBriefInfo(briefInfoMsg);

        } catch (RestClientException e) {
            log.error("获取股票"+ code +"简要信息出现异常.", e);
        }
        return null;
    }

    public List<String> getSharesCodes(){
        List codes = tencentSharesMapper.getSharesCodes();
        return codes;
    }

}
