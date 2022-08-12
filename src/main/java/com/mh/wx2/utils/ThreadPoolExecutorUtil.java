package com.mh.wx2.utils;

import java.util.concurrent.*;

public class ThreadPoolExecutorUtil {

    public static ExecutorService getThreadPool1(){

        ExecutorService threadPool = new ThreadPoolExecutor(
                5,
                8,
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

        return threadPool;
    }

}
