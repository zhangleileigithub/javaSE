/**
 * 张雷雷
 * 2022/9/23
 */
public class RunnableSun implements Runnable{
    @Override
    public void run() {
        System.out.println("RunnableSun..");
    }

    public static void main(String[] args) {
        Thread t1 = new User( );
        t1.start();

        new Thread(new RunnableSun(), "RunnableSun").start();
    }
}
