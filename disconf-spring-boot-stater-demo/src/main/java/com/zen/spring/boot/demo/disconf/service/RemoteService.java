package com.zen.spring.boot.demo.disconf.service;

import com.zen.spring.boot.demo.disconf.config.RemoteServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个未知远程服务, 这里也不使用注解的 @Service
 *
 * @author liaoqiqi
 * @version 2014-6-17
 */
@Service
public class RemoteService implements InitializingBean, DisposableBean {

    protected static final Logger LOGGER = LoggerFactory.getLogger(RemoteService.class);

    private List<String> list = new ArrayList<String>();

    @Autowired
    private RemoteServerConfig remoteServerConfig;

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        list.add(remoteServerConfig.getRemoteHost());
        list.add(String.valueOf(remoteServerConfig.getRemoteHost()));
    }

    /**
     * 更改Jedis
     */
    public void reload() {

        LOGGER.info("start to reload remote service to: " + remoteServerConfig.getRemoteHost() + " : " +
                        remoteServerConfig.getRemoteHost());

        list.add(remoteServerConfig.getRemoteHost());
        list.add(String.valueOf(remoteServerConfig.getRemoteHost()));

        LOGGER.info("reload ok.");
    }
}
