package com.zen.spring.boot.demo.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.zen.elasticjob.spring.boot.annotation.ElasticJobConfig;
import com.zen.spring.boot.demo.elasticjob.fixture.entity.Foo;
import com.zen.spring.boot.demo.elasticjob.fixture.repository.FooRepository;
import com.zen.spring.boot.demo.elasticjob.listener.MyDistributeElasticJobListener;
import com.zen.spring.boot.demo.elasticjob.listener.MyElasticJobListener;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ElasticJobConfig(cron = "${spring.elasticjob.simple.cron}", shardingTotalCount = "${spring.elasticjob.simple.shardingTotalCount}",
        shardingItemParameters = "${spring.elasticjob.simple.shardingItemParameters}",
        listenerClass = "${spring.elasticjob.simple.listenerClass}",
        distributedListenerClass = "${spring.elasticjob.simple.distributedListenerClass}",
        startedTimeoutMilliseconds = "${spring.elasticjob.simple.startedTimeoutMilliseconds}",
        completedTimeoutMilliseconds = "${spring.elasticjob.simple.completedTimeoutMilliseconds}")
public class SpringSimpleJob implements SimpleJob {

    @Resource
    private FooRepository fooRepository;

    @Override
    public void execute(final ShardingContext shardingContext) {
        System.out.println(String.format("Item: %s | Time: %s | Thread: %s | %s",
                shardingContext.getShardingItem(), new SimpleDateFormat("HH:mm:ss").format(new Date()), Thread.currentThread().getId(), "SIMPLE"));
        List<Foo> data = fooRepository.findTodoData(shardingContext.getShardingParameter(), 10);
        for (Foo each : data) {
            fooRepository.setCompleted(each.getId());
        }
    }
}
