package com.lqp.rabbitmqconsumer.rabbitListener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author itw_liuqp
 * @date 2020/6/23 9:54
 * @describe
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutListenerA {
    @RabbitHandler
    public void pocess(Map testMessage){
        System.out.println("FanoutListenerA消费者收到消息  : " +testMessage.toString());
    }
}
