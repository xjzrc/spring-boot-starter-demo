package com.zen.spring.boot.demo.disconf;

import com.zen.spring.boot.demo.disconf.task.DisconfDemoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DisconfSpringBootStaterDemoApplication implements CommandLineRunner {

    @Autowired
    private DisconfDemoTask disconfDemoTask;

    public static void main(String[] args) {
        SpringApplication.run(DisconfSpringBootStaterDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        disconfDemoTask.run();
    }
}
