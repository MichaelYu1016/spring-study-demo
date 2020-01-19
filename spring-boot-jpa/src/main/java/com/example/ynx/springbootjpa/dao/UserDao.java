package com.example.ynx.springbootjpa.dao;

import com.example.ynx.springbootjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据接口类
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-19
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
