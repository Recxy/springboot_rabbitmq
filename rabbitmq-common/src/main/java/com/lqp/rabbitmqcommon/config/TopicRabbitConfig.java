package com.lqp.rabbitmqcommon.config;

import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author itw_liuqp
 * @date 2020/6/22 16:55
 * @describe
 */
@Configuration
public class TopicRabbitConfig {
    public static final String man = "topic.man";
    public static final String woman = "topic.woman";

    @Bean
    public Queue firstQueue(){
        return new Queue(man);
    }
    @Bean
    public Queue secondQueue(){
        return new Queue(woman);
    }
    @Bean
    public TopicExchange testTopicExchange(){
        return new TopicExchange("testTopicExchange");
    }
    @Bean
    public Binding testBinding1(){
        return BindingBuilder.bind(firstQueue()).to(testTopicExchange()).with(man);
    }
    @Bean
    public Binding testBinding2(){
        return BindingBuilder.bind(secondQueue()).to(testTopicExchange()).with("topic.#");
    }
}
