package com.example.common.service;

import java.math.BigDecimal;

/**
 * 融资交易服务接口
 * 用于 Dubbo RPC 调用
 */
public interface OfTransactionService {
    
    /**
     * 查询主发票总数
     * 
     * @param companyId 企业ID
     * @return 主发票总数
     */
    Integer queryMainInvoiceTotal(String companyId);
    
    /**
     * 查询收入发票总数
     * 
     * @param companyId 企业ID
     * @return 收入发票总数
     */
    Integer queryIncomeInvoiceTotal(String companyId);
}
