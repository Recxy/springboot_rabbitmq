package com.lqp.rabbitmqconsumer.rabbitListener;

import com.lqp.rabbitmqcommon.config.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author itw_liuqp
 * @date 2020/6/22 17:08
 * @describe
 */
@Component
@RabbitListener(queues = TopicRabbitConfig.woman)
public class TopicWomanListener {
    @RabbitHandler
    public void pocess(Map testMessage){
        System.out.println("TopicWomanListener消费者收到消息  : " + testMessage.toString());
    }
}
