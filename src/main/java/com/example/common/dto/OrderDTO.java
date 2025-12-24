package com.example.common.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单数据传输对象
 * 用于跨项目共享订单数据
 * 场景2测试：DTO字段修改
 */
public class OrderDTO {
    private Long orderId;
    private Long userId;
    private String orderNumber;
    private BigDecimal totalAmount;
    private Integer status; // 0-待支付, 1-已支付, 2-已取消
    private Date createTime;
    private String productName;
    
    // 场景2测试：新增字段（向后兼容）
    private String deliveryAddress;
    private String contactPhone;
    private Integer paymentMethod; // 1-支付宝, 2-微信, 3-银行卡
    
    // 场景2测试：修改字段类型（原来可能是 Double，现在统一用 BigDecimal）
    private BigDecimal discountAmount;
    
    // 场景2测试：删除字段 - 移除了 description 字段（如果之前存在）
    // private String description; // 已删除

    public OrderDTO() {
    }

    public OrderDTO(Long orderId, Long userId, String orderNumber, BigDecimal totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
        this.status = 0;
        this.createTime = new Date();
        this.discountAmount = BigDecimal.ZERO;
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
    
    // 场景2测试：新增字段的 Getter/Setter
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    public String getContactPhone() {
        return contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    
    public Integer getPaymentMethod() {
        return paymentMethod;
    }
    
    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }
    
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }
}
