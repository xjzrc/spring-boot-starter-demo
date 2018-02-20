package com.zen.spring.boot.demo.disconf.service.callbacks;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.springframework.stereotype.Service;

@Service
@DisconfUpdateService(confFileKeys = {"testJson.json"})
public class TestJsonConfigCallback implements IDisconfUpdate {

    @Override
    public void reload() throws Exception {

        System.out.println("now i'm at xml update callback ");
    }

}
