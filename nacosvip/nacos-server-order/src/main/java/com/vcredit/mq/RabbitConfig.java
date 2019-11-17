package com.vcredit.mq;

import com.vcredit.constant.MqConst;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: RabbitConfig
 * @Description: TODO fanout 模式 rabbitmq官网建议使用
 * @author: Vampire
 * @date: 2019/10/12 15:32
 * @Copyright:
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue MessageA() {
        return new Queue(MqConst.FANOUT_QUEUENAME1);
    }

    @Bean
    public Queue MessageB() {
        return new Queue(MqConst.FANOUT_QUEUENAME2);
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange(MqConst.FANOUT_EXCHANGE);
    }

    @Bean
    Binding bindingExchangeA(Queue MessageA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(MessageA).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue MessageB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(MessageB).to(fanoutExchange);
    }

    @Bean
    public AsyncRabbitTemplate asyncRabbitTemplate(RabbitTemplate rabbitTemplate){
        return new AsyncRabbitTemplate(rabbitTemplate);
    }

}
