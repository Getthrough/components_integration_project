package com.getthrough.componentsIntegration.controller;

import com.getthrough.componentsIntegration.entity.User;
import com.getthrough.componentsIntegration.service.UserService;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.TimeZone;

/**
 * @author getthrough
 * @date 2019/12/8
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @GetMapping("/users")
    public String getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return CollectionUtils.isEmpty(allUsers) ?
                "Sorry, no users info found" + getFormattedTime(null) :
                allUsers.toString() + getFormattedTime(null);
    }

    /**
     * 获取当前时间点指定格式的时间字符串
     * @return
     */
    private String getFormattedTime(DateTimeFormatter formatter) {
        if (formatter == null)
            return Instant.now().toString();

        return formatter.format(Instant.now());
    }

}
