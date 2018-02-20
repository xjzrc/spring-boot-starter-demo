package com.zen.spring.boot.demo.disconf.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态 配置文件 示例
 *
 * @author liaoqiqi
 * @version 2014-6-17
 */
@DisconfFile(filename = "static.properties")
public class StaticConfig {

    protected static final Logger LOGGER = LoggerFactory.getLogger(StaticConfig.class);

    private static int staticVar;

    @DisconfFileItem(name = "staticVar", associateField = "staticVar")
    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        StaticConfig.staticVar = staticVar;
        LOGGER.info("i' m here: setting static class variable");
    }

}
