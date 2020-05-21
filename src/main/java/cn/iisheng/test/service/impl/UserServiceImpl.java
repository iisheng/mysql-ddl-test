package cn.iisheng.test.service.impl;

import cn.iisheng.test.entity.User;
import cn.iisheng.test.mapper.UserMapper;
import cn.iisheng.test.service.IUserService;
import cn.iisheng.test.template.RandomGetTemplate;
import cn.iisheng.test.template.RandomListTemplate;
import cn.iisheng.test.template.RandomUpdateTemplate;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * @author iisheng
 * @date 2020/05/19 09:50:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private static final int LIMIT = 1000;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private RandomGetTemplate randomGetTemplate;

    @Autowired
    private RandomListTemplate randomListTemplate;

    @Autowired
    private RandomUpdateTemplate randomUpdateTemplate;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void randomGet() {
        logger.info("do randomGet");
        randomGetTemplate.randomExecute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void randomList() {
        logger.info("do randomList");
        randomListTemplate.randomExecute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void randomUpdate() {
        logger.info("do randomUpdate");
        randomUpdateTemplate.randomExecute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void randomCreate() {
        logger.info("do randomCreate");
        iUserService.create();
    }


    @Override
    public void get(Long id) {
        User user = getOne(new QueryWrapper<User>()
                .lambda()
                .eq(User::getTestId, id));
        logger.info("getByTestId userId={}", user.getId());
    }

    @Override
    public void list(Long cursor) {
        baseMapper.queryByCursor(cursor, LIMIT);
        logger.info("list cursor = {}", cursor);

    }

    @Override
    public void update(Long id) {
        User user = getOne(new QueryWrapper<User>()
                .lambda()
                .eq(User::getTestId, id));
        user.setAddress("测试瞎填的地址");
        user.setDescription("测试乱填的描述");
        update(user, new QueryWrapper<User>()
                .lambda()
                .eq(User::getTestId, id));
        logger.info("updateById userId = {}", user.getId());
    }

    @Override
    public void create() {
        User user = User.builder()
                .address("新建地址")
                .age(18)
                .createTime(LocalDateTime.now())
                .modifyTime(LocalDateTime.now())
                .name("新人")
                .build();
        save(user);
        logger.info("create userId = {}", user.getId());
    }
}
