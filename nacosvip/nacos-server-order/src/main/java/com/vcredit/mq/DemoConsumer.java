package com.vcredit.mq;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.vcredit.constant.MqConst;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @ClassName: DemoConsumer
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/10/12 15:52
 * @Copyright:
 */
@Component
public class DemoConsumer {
    @RabbitListener(queues = MqConst.FANOUT_QUEUENAME1)
    @RabbitHandler
    public void process1(Message message, Channel channel) throws IOException {
        System.out.println("queue:fanout.message1,message:" + message);
        //return "我知道了";
       /* try {
        } catch (Exception e) {
            e.printStackTrace();
            return "你不是";
        }finally {
            channel.basicAck(1000l,true);

        }*/
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
    }

   /* @RabbitListener(queues = MqConst.FANOUT_QUEUENAME2)
    @RabbitHandler
    public void process2(String message, AMQP.Channel channel) {
        System.out.println("queue:fanout.message2,message:" + message);
    }*/
}
