/**
 * 张雷雷
 * 2022/9/23
 */

public class User extends Thread{
    @Override
    public void run() {
        System.out.println("输出USER");
    }

    public User(){

    }
    private volatile static User user;
    public static User getUser(){
        System.out.println(Thread.currentThread().getName());
        //三
        if (user==null){
            //一  二
            synchronized (User.class){
                //一
                if (user==null){
                    user = new User();
                }
            }

        }
      /*  if (user==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            user = new User();
        }*/
        return user;
    }
}
