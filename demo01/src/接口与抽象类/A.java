package 接口与抽象类;

/**
 * 张雷雷
 * 2022/9/24
 */
/*接口中有两个以上方法的时候，如果只想使用其中一个方法该怎么做？
* 使用抽象方法实现这个接口，重写接口中不需要的方法，方法体为空，
* 之后使用普通方法继承抽象方法就可以只使用接口中需要的方法*/
public interface A {
    /*
    * Jdk8之前接口中只能有抽象方法。
    * JDK8之后可以有方法的default默认实现
    * */
    //抽象方法
    abstract void fangFa1();
    //抽象方法
    void fangFa2();
    //非抽象方法
    default void fangFa3(){
        System.out.println("默认实现的方法");
    };
}

abstract class B implements A{
    @Override
    public void fangFa2() {

    }

    @Override
    public void fangFa3() {
        A.super.fangFa3();
    }
}

class C extends B{

    @Override
    public void fangFa1() {

    }
}