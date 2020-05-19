package cn.iisheng.test.template;

import cn.iisheng.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2020/05/19 17:50:42
 */
@Component
public class RandomGetTemplate extends AbstractRandomTemplate {

    @Autowired
    private IUserService iUserService;

    @Override
    public void concreteTask(Long id) {
        iUserService.get(id);
    }
}
