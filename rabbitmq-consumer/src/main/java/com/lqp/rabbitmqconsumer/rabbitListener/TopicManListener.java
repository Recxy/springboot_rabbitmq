package com.lqp.rabbitmqconsumer.rabbitListener;

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
@RabbitListener(queues = "topic.man")
public class TopicManListener {
    @RabbitHandler
    public void pocess(Map testMessage){
        System.out.println("TopicManListener消费者收到消息  : " + testMessage.toString());
    }
}
