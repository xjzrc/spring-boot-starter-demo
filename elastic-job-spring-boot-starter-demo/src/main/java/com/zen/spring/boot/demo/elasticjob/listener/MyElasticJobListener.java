package com.zen.spring.boot.demo.elasticjob.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

public class MyElasticJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        System.out.println(shardingContexts.getJobName() + " | MyElasticJobListener beforeJobExecuted");
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        System.out.println(shardingContexts.getJobName() + " | MyElasticJobListener afterJobExecuted");
    }
}
