package com.vcredit.mq;

import com.vcredit.constant.MqConst;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * @ClassName: DemoProducer
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/10/12 15:48
 * @Copyright:
 */
@Component
public class DemoProducer {
    @Autowired
    private AsyncRabbitTemplate rabbitTemplate;
    @Scheduled(cron = "0 0/1 * * * ?")
    public void sendDemoMs(){
        AsyncRabbitTemplate.RabbitConverterFuture<Object> future = rabbitTemplate.convertSendAndReceive(MqConst.FANOUT_EXCHANGE, "", "我是大帅哥");
        future.addCallback(new ListenableFutureCallback<Object>() {
            @Override
            public void onFailure(Throwable throwable) {

            }
            @Override
            public void onSuccess(Object o) {
                System.out.println("成功 : " + o);
            }
        });
    }

}


