package com.demo.script.schedule;

import com.demo.script.utils.ClickEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 验证码操作
 * @author zh
 * @date 2020-10-28
 */
@Configuration
@EnableScheduling
public class VerificationCode {

    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
        //查询是否触发验证码

        //打开验证码

        //获取图片

        //调用超级鹰获取坐标
//        ChaoJiYing.PostPic_base64();

        //触发点击事件 执行验证
//        ClickEvent.click();
    }
}
