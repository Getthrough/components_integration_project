package com.getthrough.componentsIntegration.service;

import com.getthrough.componentsIntegration.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author getthrough
 * @date 2019/12/8
 * @since
 */
public interface UserService {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUsers();

}
