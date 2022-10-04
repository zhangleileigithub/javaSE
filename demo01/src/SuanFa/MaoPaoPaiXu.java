package SuanFa;

/**
 * 张雷雷
 * 2022/2/28
 */
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        //冒泡排序  把大元素放在后面
        int [] intArr = {33,22,11,55,44};
        for (int i = 1; i < intArr.length; i++) {  //比较轮数
            for (int j = 0; j < intArr.length - i; j++) {//比较次数 并进行交换
                if (intArr[j] > intArr[j+1]){
                    //交换
                    int t = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = t;
                }
            }
        }
//        System.out.print(intArr);
        for (int num : intArr) {
            System.out.print(num+",");
        }


       /* int [] intArr = {33,22,11,55,44};
        for (int i = 0; i < intArr.length - 1; i++) {//次数  比较四次 0,1,2,3
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i]>intArr[j]){
                    int t = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = t;
                    for (int n : intArr) {
                        System.out.print(n);
                    }
                    System.out.println("========");
                }

            }
        }*/


    }
}
