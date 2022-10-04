package chouxiang;

/**
 * 张雷雷
 * 2022/2/26
 */
public interface JieKou {

    //属性
     String name="张三";

    //抽象方法
    public abstract void print();
    //默认前面有public abstract
    void print02();
    //静态方法
    public static void print03(){

    }
    //默认方法
    public default void print04(){

    }


}
