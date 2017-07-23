package com.luo.dao;

import com.luo.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);

    List<User> selectUserByUserName(@Param("userName") String userName);

}
