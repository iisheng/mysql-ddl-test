package cn.iisheng.test.service;

import cn.iisheng.test.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author iisheng
 * @date 2020/05/19 09:50:00
 */
public interface IUserService extends IService<User> {

    void randomGet();

    void randomUpdate();

    void randomCreate();
}
