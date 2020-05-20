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

    private static final String SUCCESS = "SUCCESS";

    @Autowired
    private IUserService iUserService;

    @GetMapping("/randomGet")
    public String randomGet() {
        iUserService.randomGet();
        return SUCCESS;
    }


    @GetMapping("/randomList")
    public String randomList() {
        iUserService.randomList();
        return SUCCESS;
    }

    @GetMapping("/randomCreate")
    public String randomCreate() {
        iUserService.randomCreate();
        return SUCCESS;
    }

    @GetMapping("/randomUpdate")
    public String randomUpdate() {
        iUserService.randomUpdate();
        return SUCCESS;
    }
}
