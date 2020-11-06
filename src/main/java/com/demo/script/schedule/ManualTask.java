package com.demo.script.schedule;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 模仿人工操作 防止被封
 * @date 2020-11-6
 */
@Configuration
@EnableScheduling
public class ManualTask {

    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
        System.out.println("开始进行模仿人工操作:");
    }
}
