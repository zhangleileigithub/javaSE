package nimingneibulei;

/**
 * 张雷雷
 * 2022/2/26
 */
public class NiMingNeiBuLei {
    public static void main(String[] args) {
        Pet tiger = new Tiger();
        tiger.eat();
        //匿名内部类
        //就是使用接口时不想写接口的实现类，那么就直接new接口重写接口的方法。
        Pet pet = new Pet() {
            @Override
            public void eat() {
                System.out.println("牛在吃草。。。。");
            }
        };
        pet.eat();

        Pet p = new Pet() {
            @Override
            public void eat() {
                System.out.println("er牛在吃草。。。。");
            }
        };
        p.eat();
    }
}

interface Pet {
    void eat();
}
class Tiger implements Pet{

    @Override
    public void eat() {
        System.out.println("老虎在吃肉。。。。。");
    }
}
class cat implements Pet{

    @Override
    public void eat() {
        System.out.println("猫在吃鱼。。。。。");
    }
}