package com.mh.wx2.model.tencentsharesinfo;

import lombok.Data;

@Data
public class BriefInfoMsg {

    private String SharesName;
    private String SharesCode;
    private String CurrPrice;
    private String RiseFall;
    private String RiseFallPercent;
    private String TradeAmount;
    private String TradeSumPrice;
    private String MarketCap;
    private String CreateDate;
    private String CreateTime;
}
