package com.abin.lee.spring.boot.redis.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abin on 2018/7/30.
 */
@Slf4j
@SpringBootApplication
@RestController
public class SpringBootRedisApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
//        ApplicationContext ctx = SpringApplication.run(NearbyApplication.class, args);
//        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
//        for (String profile : activeProfiles) {
//            log.warn("---------Spring Boot 使用profile为:{}" , profile);
//        }

        SpringApplication.run(SpringBootRedisApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    boot redis 启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SpringBootRedisApplication.class);
    }

}