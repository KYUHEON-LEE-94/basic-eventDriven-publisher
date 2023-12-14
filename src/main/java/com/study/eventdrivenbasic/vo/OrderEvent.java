package com.study.eventdrivenbasic.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * packageName    : com.study.eventdrivenbasic.vo
 * fileName       : OrderEvent
 * author         : heon
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05           heon               최초 생성
 */
@Getter
@Setter
public class OrderEvent{

    private Long orderId;
    private String name;
}
