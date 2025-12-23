package com.example.common.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单数据传输对象
 * 用于跨项目共享订单数据
 */
public class OrderDTO {
    private Long orderId;
    private Long userId;
    private String orderNumber;
    private BigDecimal totalAmount;
    private Integer status; // 0-待支付, 1-已支付, 2-已取消
    private Date createTime;
    private String productName;

    public OrderDTO() {
    }

    public OrderDTO(Long orderId, Long userId, String orderNumber, BigDecimal totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
        this.status = 0;
        this.createTime = new Date();
    }

    // Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
