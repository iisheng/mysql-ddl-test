package cn.iisheng.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author iisheng
 * @date 2020/05/18 09:50:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void randomGet() {
        iUserService.randomGet();
    }

    @Test
    public void randomCreate() {
        iUserService.randomCreate();
    }

    @Test
    public void randomUpdate() {
        iUserService.randomUpdate();
    }
}
