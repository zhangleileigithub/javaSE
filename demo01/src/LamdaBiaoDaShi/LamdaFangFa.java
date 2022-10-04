package LamdaBiaoDaShi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 张雷雷
 * 2022/3/4
 */
public class LamdaFangFa {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Collections.addAll(list, "xx","cc","vv","bb","nn","mm");
        System.out.print(list);
        System.out.println();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                升序
                return o1.compareTo(o2);
            }
        });
        System.out.print(list);

        /*
        *  系统可以推断出list集合的sort方法需要一个Comparator接口，系统也知道Comparator接口需要重写Compara（）方法，
        * 我们可以吧系统推断出来的信息省略，还剩方法参数列表与方法体，在参数列表与方法体之间使用 -> 连接
        * ，这就是被Lamda表达式。
        * 所以Lamda表达式也可以看做一个匿名方法。
        * */
        list.sort((String o1, String o2) ->{
            return o2.compareTo(o1);
        });
        /** lamda表达式的语法：
        *   （参数列表）->{Lamda体}
         *  说明：
         *  1.参数列表中的参数类型可以省略
         *  2.参数列表中如果只有一个参数则小括弧可以省略
         *  3.Lamda体只有一条语句时大括弧可省，如果这条语句时return语句时，那么return也可以省略。
         *  (如果接口只需要重写一个抽象方法时，可以使用Lamda表达式 )
        * */
        list.sort((o1,o2)->
                o1.compareTo(o2));
    }
}
