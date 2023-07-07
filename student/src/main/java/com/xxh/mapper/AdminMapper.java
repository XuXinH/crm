package com.xxh.mapper;

import com.xxh.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository("AdminMapper")
public interface AdminMapper {
    /**
     * 登录
     * @param admin
     * @return
     */
    Admin login(Admin admin);

    /**
     * 注册
     * @param admin
     * @return
     */
    Integer register(Admin admin);

    /**
     * 获取姓名（验证不能重名）
     * @param admin
     * @return
     */
    Admin getByName(Admin admin);

}
