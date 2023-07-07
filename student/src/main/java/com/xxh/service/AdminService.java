package com.xxh.service;

import com.xxh.pojo.Admin;

public interface AdminService {
    /**
     * 登录
     * @param admin 用户信息
     * @return
     */
    Admin login(Admin admin);

    /**
     * 注册
     * @param admin 用户信息
     * @return
     */
    int register(Admin admin);
}
