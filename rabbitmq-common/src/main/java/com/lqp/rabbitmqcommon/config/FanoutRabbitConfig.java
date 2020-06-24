package com.lqp.rabbitmqcommon.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author itw_liuqp
 * @date 2020/6/23 9:35
 * @describe
 */
@Configuration
public class FanoutRabbitConfig {
    /**
     *  创建三个队列 ：fanout.A   fanout.B  fanout.C
     *  将三个队列都绑定在交换机 fanoutExchange 上
     *  因为是扇型交换机, 路由键无需配置,配置也不起作用
     */
    @Bean
    public Queue queueA(){
        return new Queue("fanout.A");
    }
    @Bean
    public Queue queueB(){
        return new Queue("fanout.B");
    }
    @Bean
    public Queue queueC(){
        return new Queue("fanout.C");
    }
    @Bean
    public FanoutExchange testFanoutExchange(){
        return new FanoutExchange("testFanoutExchange");
    }
    @Bean
    public Binding testBindingExchangeA(){
        return BindingBuilder.bind(queueA()).to(testFanoutExchange());
    }
    @Bean
    public Binding testBindingExchangeB(){
        return BindingBuilder.bind(queueB()).to(testFanoutExchange());
    }
    @Bean
    public Binding testBindingExchangeC(){
        return BindingBuilder.bind(queueC()).to(testFanoutExchange());
    }
}
