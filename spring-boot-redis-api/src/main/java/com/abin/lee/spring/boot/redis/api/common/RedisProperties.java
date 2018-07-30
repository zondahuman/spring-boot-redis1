package com.abin.lee.spring.boot.redis.api.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by abin on 2018/7/30.
 */
@Component
@ConfigurationProperties(prefix = "spring.redis.cache")
@Data
public class RedisProperties {

    private String clusterNodes;
    private Integer   commandTimeout;
}