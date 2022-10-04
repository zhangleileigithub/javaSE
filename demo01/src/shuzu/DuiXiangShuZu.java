package shuzu;

/**
 * 张雷雷
 * 2022/2/27
 */
public class DuiXiangShuZu {
    public static void main(String[] args) {
//      对象数组
        Person [] Arr = new Person[10];
        Person p = new Person("张三", 22);
        Arr[0] = p;
        Arr[1] = new Person("李四", 21);
//        fori循环
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
        System.out.println("--------------");
//        iter循环
        for (Person person : Arr) {
            System.out.println(person);
        }
    }
}
class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}