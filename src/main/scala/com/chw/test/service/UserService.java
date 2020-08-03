package com.chw.test.service;

import com.chw.test.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author CarlBryant
 * @since 2020-08-01
 */
public interface UserService extends IService<User> {

    User getUserByScala();

}
