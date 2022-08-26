package com.itlxl.dao;

import com.itlxl.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into tb_user(name, money) values (#{name},#{money})")
    void save(User user);
}
