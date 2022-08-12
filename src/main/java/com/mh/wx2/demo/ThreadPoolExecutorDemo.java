package com.mh.wx2.demo;

import java.util.concurrent.*;

//自定义线程池
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        //得到自己电脑cpu是几核的 若CPU密集型 一般maximumPoolSize默认 为自己电脑cpu为几核 +1 或者 +2 若为IO密集型的话就是 CPU核数/1-阻塞系数（0.8~0.9）
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                2,
                2L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                Executors.defaultThreadFactory(),
                //拒绝访问策略
                /**
                 * new ThreadPoolExecutor.AbortPolicy() :AbortPolicy(默认)
                 *      直接抛出RejectedExecutionException异常阻止系统正常运行
                 * DiscardOldestPolicy：抛弃队列中等待最久的任务，然后把当前任务加人队列中
                 * 尝试再次提交当前任务。
                 * DiscardPolicy：该策略默默地丢弃无法处理的任务，不予任何处理也不抛出异常。
                 * 如果允许任务丢失，这是最好的一种策略。
                 */
                //CallerRunsPolicy：“调用者运行”一种调节机制，该策略既不会抛弃任务，也不会抛出异常，而是将某些任务回退到调用者，从而降低新任务的流量。
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        try{
            String[] haha = {"11","22","33","44","55"};
//            for (int i = 0; i <=haha.length ; i++) {
//                System.out.println(haha[i]);
//            }

            for (int i = 0; i <=haha.length -1 ; i++) {
                int num = i;
                threadPool.execute(
                        new Thread(()->{

                            System.out.println(Thread.currentThread().getName()+"开始执行工作" + haha[num]);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        })
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭线程池
            threadPool.shutdown();
        }
    }
}

