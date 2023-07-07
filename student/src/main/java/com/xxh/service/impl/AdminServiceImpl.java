package com.xxh.service.impl;

import com.xxh.mapper.AdminMapper;
import com.xxh.pojo.Admin;
import com.xxh.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Q
 * @version 1.0
 * @className AdminServiceImpl
 */
@Service("AdminService")
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }

    @Override
    public int register(Admin admin) {
        //判断是否重名
        Admin getName = adminMapper.getByName(admin);
        if (getName == null) { //说明没有重名
            return adminMapper.register(admin);
        }
        return 0;
    }
}
