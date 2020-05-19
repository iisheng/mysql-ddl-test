package cn.iisheng.test.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2020/05/19 08:08:56
 */
@Component
public class FirstRandomTask {
    private static Logger logger = LoggerFactory.getLogger(FirstRandomTask.class);

    @Scheduled(fixedRate = 3000)
    public void randomTask() {
        logger.info("do first randomTask");
    }
}
