package com.example.common.constant;

/**
 * RabbitMQ 队列常量定义
 * 
 * @author system
 * @date 2024-01-15
 */
public class QueueConstant {
    
    /**
     * 订单事件队列
     */
    public static final String ORDER_EVENT_QUEUE = "order.event.queue";
    
    /**
     * 订单事件路由键
     */
    public static final String ORDER_EVENT_KEY = "order.event.key";
    
    /**
     * 订单通知队列
     */
    public static final String ORDER_NOTIFICATION_QUEUE = "order.notification.queue";
    
    /**
     * 订单通知路由键
     */
    public static final String ORDER_NOTIFICATION_KEY = "order.notification.key";
}
