package com.example.common.service;

import com.example.common.dto.UserDTO;

/**
 * 用户服务接口
 */
public interface UserService {
    
    /**
     * 根据ID获取用户
     */
    UserDTO getUserById(Long id);
    
    /**
     * 创建用户
     */
    UserDTO createUser(String username, String email);
    
    /**
     * 验证用户邮箱
     */
    boolean validateEmail(String email);
}
