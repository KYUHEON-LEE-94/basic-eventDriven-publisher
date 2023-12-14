package com.study.eventdrivenbasic.publisher;

import com.study.eventdrivenbasic.vo.OrderEvent;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.study.eventdrivenbasic.publisher
 * fileName       : EventPublisher
 * author         : heon
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05           heon               최초 생성
 */
@Component
public class EventPublisher {
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public EventPublisher (AmqpTemplate amqpTemplate){
        this.amqpTemplate = amqpTemplate;
    }

    public void publishOrderEvent(OrderEvent orderEvent){
        //exchangeName, routingKey 혹은 queue name, 메시지 내용
        amqpTemplate.convertAndSend("amq.topic", "testQueue", orderEvent);
        System.out.println("메시지 발송!");
    }
}
