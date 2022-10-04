package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 张雷雷
 * 2022/9/24
 */
/*创建线程池,拿到线程池中的单个线程执行方法体*/
public class A {
    public static void main(String[] args) {
//       创建一个最大线程数量为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
             int index = i;
           /* try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            //使用线程池中的一个线程执行 方法体
           /* executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName()+":线程"+index);
            });*/
            //上方代码为下方代码的Lamda表达式
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":线程"+index);
                }
            });

        }
        executorService.shutdown();
    }
}

