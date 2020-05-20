package cn.iisheng.test.template;

import cn.iisheng.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2020/05/20 08:01:49
 */
@Component
public class RandomListTemplate extends AbstractRandomTemplate {

    @Autowired
    private IUserService iUserService;

    @Override
    public void concreteTask(Long id) {
        iUserService.list(id);
    }
}
