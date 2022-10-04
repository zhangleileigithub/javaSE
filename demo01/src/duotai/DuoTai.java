package duotai;

/**
 * 张雷雷
 * 2022/2/25
 */
public class DuoTai {
    public static void main(String[] args) {
        //向上转型  ：只能访问父类实例变量和实例方法
        //           优先访问子类中的
        Animal n = new Dog();
        n.print();
        String name = n.name;
        System.out.println(name);
        n = new Cat();
        n.print();
    }
}
class Animal {
    String name;
    public void print() {

    }
}
class Dog extends Animal {
    @Override
    public void print() {
        System.out.println("狗吃肉");
    }
}
class Cat extends Animal {
    @Override
    public void print() {
        System.out.println("猫吃鱼");
    }
}