package qian;

import java.text.DecimalFormat;

/**
 * 张雷雷
 * 2022/3/1
 */
public class FormatAndZhuangXiangChaiXiang {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("###,###.0000");
        String s =d.format(124452.21);
        System.out.println(s);

        Integer i1 = 1200;  //创建对象，对象中包含1200属性  自动装箱
        int i2 = i1;    //把i1对象中的属性赋予i2           自动拆箱
        Integer i0 = 1200;
        System.out.println(i0 == i2); //true  比较值
        System.out.println(i0 == i1); //false  比较两个对象

        Integer i3 = 120;
        Integer i4 = 120;
        System.out.println(i3 == i4);  //true  -128~127比较常用，会经过共享模式放在共享池中
    }
}
