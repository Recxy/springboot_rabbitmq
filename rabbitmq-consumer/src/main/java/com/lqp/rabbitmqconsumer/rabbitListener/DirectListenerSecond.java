package com.lqp.rabbitmqconsumer.rabbitListener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author itw_liuqp
 * @date 2020/6/22 16:10
 * @describe
 */
@Component
@RabbitListener(queues = "testDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectListenerSecond {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectListenerSecond消费者收到消息  : " + testMessage.toString());
    }

}