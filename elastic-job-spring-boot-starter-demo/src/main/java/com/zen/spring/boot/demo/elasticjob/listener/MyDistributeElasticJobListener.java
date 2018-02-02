package com.zen.spring.boot.demo.elasticjob.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.AbstractDistributeOnceElasticJobListener;

public class MyDistributeElasticJobListener extends AbstractDistributeOnceElasticJobListener {

    public MyDistributeElasticJobListener(long startedTimeoutMilliseconds, long completedTimeoutMilliseconds) {
        super(startedTimeoutMilliseconds, completedTimeoutMilliseconds);
    }

    @Override
    public void doBeforeJobExecutedAtLastStarted(ShardingContexts shardingContexts) {
        System.out.println("MyDistributeElasticJobListener doBeforeJobExecutedAtLastStarted...");
    }

    @Override
    public void doAfterJobExecutedAtLastCompleted(ShardingContexts shardingContexts) {
        System.out.println("MyDistributeElasticJobListener doAfterJobExecutedAtLastCompleted...");

    }
}
