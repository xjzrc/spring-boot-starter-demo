package com.zen.spring.boot.demo.elasticjob;

import com.zen.spring.boot.demo.embedzk.EmbedZookeeperServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticJobSpringBootStarterDemoApplication {

    public static void main(String[] args) {
        EmbedZookeeperServer.start(6181);
        SpringApplication.run(ElasticJobSpringBootStarterDemoApplication.class, args);
    }
}
