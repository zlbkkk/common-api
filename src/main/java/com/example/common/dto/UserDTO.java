package com.example.common.dto;

import java.util.Date;

/**
 * 用户数据传输对象
 * 用于跨项目共享用户数据
 */
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private Integer status; // 0-禁用, 1-正常
    private Date createTime;
    private Date lastLoginTime;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.status = 1;
        this.createTime = new Date();
    }

    public UserDTO(Long id, String username, String email, String phone, Integer status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.createTime = new Date();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
