package com.abin.lee.spring.boot.redis.api.test;

import com.abin.lee.spring.boot.redis.api.SpringBootRedisApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.JedisCluster;

import javax.inject.Inject;

/**
 * Created by abin on 2018/7/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootRedisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class TestJedisCluster {

    @Inject
    private JedisCluster jedisCluster;

    @Test
    public void testJedis() {
        jedisCluster.set("test_jedis_cluster", "38967");
        Assert.assertEquals("38967", jedisCluster.get("test_jedis_cluster"));
        jedisCluster.del("test_jedis_cluster");
    }


    @Test
    public void testJedis1() {
        System.out.println("------------------111------");
    }
}