package com.getthrough.componentsIntegration;

import com.getthrough.componentsIntegration.entity.User;
import com.getthrough.componentsIntegration.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author getthrough
 * @date 2019/12/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        log.info("---------------- UserMapperTest testSelect ----------------");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
