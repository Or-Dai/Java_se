package com.lyf.thread.threadpool._new;

import java.util.concurrent.*;

/**
 * @Author: LiangYiFeng
 * @Description： 自定义 ThreadPoolExecutor
 * @Date: Create in 2022/9/8 7:54
 * @Modified By:
 */
public class CreateThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                2,
                500,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r);
                        thread.setName("测试----");
                        return thread;
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
        );
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池执行任务！！！");
            }
        });

        Future<Object> future = executor.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("获取结果——----");
                return null;
            }
        });
        future.get();

        executor.shutdown();
    }
}
