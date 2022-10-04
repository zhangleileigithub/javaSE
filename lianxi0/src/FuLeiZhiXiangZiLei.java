/**
 * 张雷雷
 * 2022/9/22
 * 父类引用指向子类对象
 */
public class FuLeiZhiXiangZiLei {
    public static void main(String[] args) {
       /* Animal animal = new Animal();
        Animal animal1= new Dog();*//*父类引用指向子类对象,优先调用子类重写之后的方法，
        子类没有重写时调它本身的方法,不可以调用子类独有的方法*//*
        Dog dog = new Dog();
        animal.bark();//动物叫。。。
        animal1.bark();//狗叫。。。
        dog.bark();//狗叫。。。
        dog.dogType();//这是什么品种。。。*/
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(() -> {
                User user = User.getUser();
                System.out.println(user);
            }, "线程：1");
            t1.start();
        }

        Thread t2 = new Thread(() -> {
            User user = User.getUser();
            System.out.println(user);
        }, "线程：1");
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        },"mingzi");
        Thread t3 = new Thread(() -> {
            User user = User.getUser();
            System.out.println(user);
        }, "线程：1");


        t2.start();
        t3.start();



    }
}
class Animal{
    public void bark(){
        System.out.println("动物叫。。。");
    }
}
class Dog extends Animal{
    @Override
    public void bark() {
        System.out.println("狗叫。。。");
    }

    public void dogType(){
        System.out.println("这是什么品种。。。");
    }
}