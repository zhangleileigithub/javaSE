package shuzu;

/**
 * 张雷雷
 * 2022/2/27
 */
public class BianChangCanShu {
    public static void main(String[] args) {
        BianChangCanShu.print(0,1,2,3,4,5);
        print(0);
        print(1,2);
        print(1,2,3);
        print(1,2,3,4,5,6);
        print(1,1,1,1,1);

        int [] intArr = {0,1,2};
        print(intArr);
    }
    public static int[] print(int ... bianCahngCanShuBianLiang){
        return bianCahngCanShuBianLiang;
    }
}
