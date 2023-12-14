package com.study.eventdrivenbasic;

import com.study.eventdrivenbasic.publisher.EventPublisher;
import com.study.eventdrivenbasic.vo.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventDrivenBasicApplication {


    public static void main(String[] args) {
        SpringApplication.run(EventDrivenBasicApplication.class, args);
    }

}
