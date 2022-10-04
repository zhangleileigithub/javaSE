package jicheng;

/**
 * 张雷雷
 * 2022/2/25
 */
public class JiCheng extends FengZhuang {
    //静态方法只能调用静态变量和静态方法    实例方法所有都可以调用
    static String cat;
    String dog;

    public JiCheng() {
    }

    public JiCheng(String name, int age, char sex, String cat, String dog) {
        super(name, age, sex);
        this.cat = cat;
        this.dog = dog;
    }
    public  void print() {
        super.print();//调用父类中的输出方法
        System.out.println("继承的输出方法输出子类的实例变量。。。"+cat);
        System.out.println("继承的输出方法输出子类的实例变量。。。"+dog);
        System.out.println("继承的输出方法输出父类的实例变量。。。"+super.name);
        System.out.println("继承的输出方法输出父类的实例变量。。。"+super.age);
        System.out.println("继承的输出方法输出父类的实例变量。。。"+super.sex);
    }

}
class Test{
    public static void main(String[] args) {
        JiCheng jiCheng = new JiCheng("张三", 22, '男', "猫", "狗");
        /*
        System.out.println(jiCheng.sex);
        System.out.println(jiCheng.cat);
        System.out.println(jiCheng.age);
        System.out.println(jiCheng.name);
        System.out.println(jiCheng.dog);
        */
        jiCheng.print();

    }
}