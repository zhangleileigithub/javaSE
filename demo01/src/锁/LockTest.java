package 锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 张雷雷
 * 2022/10/2
 */
public class LockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        try {
            //加锁
            lock.lock();
            //执行操作

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放锁
            lock.unlock();
        }
    }
}
