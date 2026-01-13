package com.example.common.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单事件消息 DTO
 * 用于 RabbitMQ 消息传递
 * 
 * @author system
 * @date 2024-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEventDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 订单ID
     */
    private Long orderId;
    
    /**
     * 订单编号
     */
    private String orderNo;
    
    /**
     * 用户ID
     */
    private Long userId;
    
    /**
     * 订单状态
     */
    private String orderStatus;
    
    /**
     * 订单金额
     */
    private Double amount;
    
    /**
     * 事件类型：ORDER_CREATED, ORDER_PAID, ORDER_SHIPPED
     */
    private String eventType;
    
    /**
     * 事件时间戳
     */
    private Long timestamp;
}
