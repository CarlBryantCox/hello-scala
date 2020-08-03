package com.chw.test.service.impl;

import com.chw.test.entity.User;
import com.chw.test.mapper.UserMapper;
import com.chw.test.mapper.UserScalaMapper;
import com.chw.test.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author CarlBryant
 * @since 2020-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserScalaMapper userScalaMapper;

    @Override
    public User getUserByScala() {
        return userScalaMapper.getUser(1);
    }
}
