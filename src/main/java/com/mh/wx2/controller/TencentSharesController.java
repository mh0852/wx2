package com.mh.wx2.controller;

import com.mh.wx2.api.TencentSharesApi;
import com.mh.wx2.utils.ThreadPoolExecutorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;

@Component
public class TencentSharesController {
    public static Logger log = Logger.getLogger(TencentSharesController.class);

    @Autowired
    private TencentSharesApi tencentSharesApi ;

    @Scheduled(cron = "0 0 0 * * *")
    public void dosomething(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        ExecutorService threadPool1 = ThreadPoolExecutorUtil.getThreadPool1();

        List<String> sharesCodes = tencentSharesApi.getSharesCodes();

        for (int i = 0; i <=sharesCodes.size() -1 ; i++){

            int num = i;
            threadPool1.execute(
                    new Thread(()->{

//                        System.out.println(Thread.currentThread().getName()+"开始执行工作" + sharesCodes.get(num));
                        try{
                            tencentSharesApi.getBySharesCode(sharesCodes.get(num));
                        }catch (Exception e){
                            e.printStackTrace();
                            log.error(sharesCodes.get(num) + "报错啦" + e);
                        }

//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    })
            );

        }

    }
}
