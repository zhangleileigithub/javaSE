package SuanFa;

/**
 * 张雷雷
 * 2022/2/28
 */
public class XuanZePaiXu {
    public static void main(String[] args) {
        //选择排序   有小到大
//        先定义最小元素下标为0，然后让最小元素下标与之后的元素比较交换
        int[] intArr = {33, 22, 11, 55, 44};

        for (int i = 0; i < intArr.length-1; i++) {
            int min = i;
            for (int j = min + 1; j < intArr.length; j++) {
                if (intArr[j]<intArr[min]){
                    min = j;
                }
                if (min != i){
                    int t = intArr[i];
                    intArr[i] = intArr[min];
                    intArr[min] = t;
                }
            }
        }
       /* for (int j = 0; j < intArr.length - 1; j++) {
            int min = j;

            for (int i = min + 1; i < intArr.length; i++) {
                if (intArr[i] < intArr[min]) {
                    int t = intArr[i];
                    intArr[i] = intArr[min];
                    intArr[min] = t;
                }
            }
        }*/
        for (int num : intArr) {
            System.out.print(num + ",");
        }
    }
}
