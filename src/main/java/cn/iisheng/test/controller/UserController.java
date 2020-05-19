package cn.iisheng.test.controller;

import cn.iisheng.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iisheng
 * @date 2020/05/19 09:39:32
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/randomGet")
    public void randomGet() {
        iUserService.randomGet();
    }

    @GetMapping("/randomCreate")
    public void randomCreate() {
        iUserService.randomCreate();
    }

    @GetMapping("/randomUpdate")
    public void randomUpdate() {
        iUserService.randomUpdate();
    }
}
