package com.example.common.service;

import com.example.common.dto.OrderDTO;
import java.util.List;

/**
 * 订单服务接口
 * 用于跨项目共享订单服务定义
 */
public interface OrderService {
    
    /**
     * 创建订单
     */
    OrderDTO createOrder(Long userId, String productName, java.math.BigDecimal amount);
    
    /**
     * 根据订单ID获取订单
     */
    OrderDTO getOrderById(Long orderId);
    
    /**
     * 根据用户ID获取订单列表
     */
    List<OrderDTO> getOrdersByUserId(Long userId);
    
    /**
     * 更新订单状态
     */
    boolean updateOrderStatus(Long orderId, Integer status);
    
    /**
     * 取消订单
     */
    boolean cancelOrder(Long orderId);
    
    /**
     * 获取订单状态文本描述
     * 用于 Dubbo RPC 调用测试
     */
    String getOrderStatusText(Long orderId);
}
