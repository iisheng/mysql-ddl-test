package cn.iisheng.test.service.impl;

import cn.iisheng.test.entity.User;
import cn.iisheng.test.mapper.UserMapper;
import cn.iisheng.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author iisheng
 * @date 2020/05/19 09:50:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void randomGet() {
        logger.info("do randomGet");
    }

    @Override
    public void randomUpdate() {
        logger.info("do randomUpdate");

    }

    @Override
    public void randomCreate() {
        logger.info("do randomCreate");

    }
}
