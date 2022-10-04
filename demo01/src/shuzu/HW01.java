package shuzu;

/**
 * 张雷雷
 * 2022/2/23
 */
public class HW01 {
    String name;
    int age;
    static String work;

    public HW01(String name, int age) {
        this.name = name;
        this.age = age;
    }
   /*有下面得出方法中不能有静态变量
   因为静态变量在类加载是就会在内存中分配空间
    public void test(){
        String a;
//        static int b;
    }
    public static void test2(){
        String a;
//        static int b;
    }*/

}
