package jicheng;

/**
 * 张雷雷
 * 2022/2/25
 * 面向对象的三大特征之封装
 */
public class FengZhuang {
    String name;
    int age;
    char sex;

    public FengZhuang() {
    }

    public FengZhuang(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public  void print() {
        System.out.println("封装的属性（实例变量）。。。");
    }
}
