package shuzu;

/**
 * 张雷雷
 * 2022/2/27
 */
public class SuiJiShu {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            double random = Math.random();
//            System.out.println(random);
//        }
//      数组乱序
        int [] intArr = new int[]{11,22,33,44,55,66};
        for (int i = 0; i < intArr.length; i++) {
            double random = Math.random();
            int num = (int) (random * intArr.length);
            System.out.print(num);
            int t = intArr[i];
            intArr[i] = intArr[num];
            intArr[num] = t;
        }
        System.out.println();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }

    }
}
