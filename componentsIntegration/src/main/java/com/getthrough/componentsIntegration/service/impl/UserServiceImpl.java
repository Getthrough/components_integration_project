package com.getthrough.componentsIntegration.service.impl;

import com.getthrough.componentsIntegration.entity.User;
import com.getthrough.componentsIntegration.mapper.UserMapper;
import com.getthrough.componentsIntegration.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author getthrough
 * @date 2019/12/8
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }

}
