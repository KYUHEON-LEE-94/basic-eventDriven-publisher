package com.study.eventdrivenbasic;

import com.study.eventdrivenbasic.publisher.EventPublisher;
import com.study.eventdrivenbasic.vo.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.study.eventdrivenbasic
 * fileName       : EventPublisherRunner
 * author         : heon
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05           heon               최초 생성
 */
@Component
public class EventPublisherRunner implements CommandLineRunner {

    private final EventPublisher eventPublisher;

    @Autowired
    public EventPublisherRunner(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void run(String... args) {
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setOrderId(1L);
        orderEvent.setName("테스트 이벤트");

        // 이벤트를 발행
        eventPublisher.publishOrderEvent(orderEvent);
    }
}
