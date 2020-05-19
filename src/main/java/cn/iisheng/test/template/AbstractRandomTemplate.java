package cn.iisheng.test.template;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author iisheng
 * @date 2020/05/19 17:41:47
 */
public abstract class AbstractRandomTemplate {

    private static final int LOOP_OVER_VALUE = 5;

    private static final int LOOP_INIT_VALUE = 0;

    private static final int BOUND = 1000000;

    private static final int RANDOM_SEED = 1;


    /**
     * 具体任务
     *
     * @param id 测试表id
     */
    public abstract void concreteTask(Long id);

    public void randomExecute() {
        Random r = new Random(RANDOM_SEED);
        for (int i = LOOP_INIT_VALUE; i < LOOP_OVER_VALUE; i++) {
            long random = r.nextInt(BOUND);
            concreteTask(random);
        }
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
