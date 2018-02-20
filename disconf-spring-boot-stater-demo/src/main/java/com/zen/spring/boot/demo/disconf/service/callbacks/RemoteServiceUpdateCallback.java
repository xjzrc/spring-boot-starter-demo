package com.zen.spring.boot.demo.disconf.service.callbacks;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.zen.spring.boot.demo.disconf.config.RemoteServerConfig;
import com.zen.spring.boot.demo.disconf.service.RemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 这是RemoteService的回调函数类
 *
 * @author liaoqiqi
 * @version 2014-6-17
 */
@Service
@DisconfUpdateService(classes = {RemoteServerConfig.class})
public class RemoteServiceUpdateCallback implements IDisconfUpdate {

    protected static final Logger LOGGER = LoggerFactory.getLogger(RemoteServiceUpdateCallback.class);

    @Autowired
    private RemoteService remoteService;

    /**
     *
     */
    public void reload() throws Exception {

        remoteService.reload();
    }

}
