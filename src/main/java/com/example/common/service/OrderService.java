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
    
    /**
     * 获取订单详细信息（包含状态文本）
     * 用于测试完整的 HTTP → Dubbo 调用链
     */
    String getOrderDetails(Long orderId);
    
    /**
     * 获取订单摘要信息（用于测试 Dubbo RPC 调用）
     * 这个方法会被 service-b 通过 Dubbo RPC 调用
     * 
     * @param orderId 订单ID
     * @return 订单摘要信息，格式：订单号-金额-状态
     */
    String getOrderSummary(Long orderId);
    
    /**
     * 【新增 Dubbo 方法】获取订单状态变更历史
     * 
     * 场景说明：
     * - 用于模拟 beehive-order-finance 中“FinanceProvider 新增方法”的真实场景
     * - 由 service-a 作为 Dubbo Provider 实现该方法
     * - 目前 service-b 暂不调用，模拟“先扩展接口和提供者，消费方后续再接入”的情况
     *
     * @param orderId 订单ID
     * @return 订单状态变更历史的文本描述
     */
    String getOrderStatusHistory(Long orderId);
}
