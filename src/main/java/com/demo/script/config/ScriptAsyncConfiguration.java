package com.demo.script.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync(proxyTargetClass = true)
@Slf4j
public class ScriptAsyncConfiguration implements AsyncConfigurer {


    public ThreadPoolTaskExecutor dispatchAsyncExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        //缓存队列
        executor.setQueueCapacity(20);

        executor.setKeepAliveSeconds(10000);
        executor.initialize();
        return executor;
    }

    @Override
    public Executor getAsyncExecutor() {
        return dispatchAsyncExecutor();
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return (throwable, method, objects) -> {
            log.error(throwable.getMessage(),throwable);
        };
    }
}
