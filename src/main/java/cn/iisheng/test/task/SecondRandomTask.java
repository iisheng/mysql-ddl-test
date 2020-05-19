package cn.iisheng.test.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2020/05/19 08:09:11
 */
@Component
public class SecondRandomTask {

    @Scheduled(fixedRate = 3000)
    public void randomTask(){

    }
}
