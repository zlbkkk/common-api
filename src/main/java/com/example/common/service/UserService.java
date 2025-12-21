package com.example.common.service;

import com.example.common.dto.UserDTO;
import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {
    
    /**
     * 根据ID获取用户
     */
    UserDTO getUserById(Long id);
    
    /**
     * 创建用户 - 修改：增加手机号参数
     */
    UserDTO createUser(String username, String email, String phoneNumber);
    
    /**
     * 验证用户邮箱
     */
    boolean validateEmail(String email);
    
    /**
     * 新增：批量获取用户
     */
    List<UserDTO> getUsersByIds(List<Long> ids);
    
    /**
     * 新增：更新用户状态
     */
    boolean updateUserStatus(Long userId, Integer status);
    
    /**
     * 新增：根据手机号查询用户
     */
    UserDTO getUserByPhoneNumber(String phoneNumber);
}
