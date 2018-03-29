package com.zen.spring.boot.demo.elasticjob.job;

import com.dangdang.ddframe.job.api.script.ScriptJob;
import com.zen.elasticjob.spring.boot.annotation.ElasticJobConfig;

/*@ElasticJobConfig(cron = "0/2 * * * * ?", shardingTotalCount = 3,
        shardingItemParameters = "0=Beijing,1=Shanghai,2=Guangzhou",
        scriptCommandLine = "E:/githubProject/spring-boot-starter-demo/elastic-job-spring-boot-starter-demo/src/main/resources/script/demo.bat")*/
public class SpringScripJob implements ScriptJob {
}
