package SuanFa;

/**
 * 张雷雷
 * 2022/2/28
 */
public class ErFenChaZhao {
    public static void main(String[] args) {
        //二分查找  数组已经实现了有小到大的排序才可以
        int[] intArr = {33, 22, 11, 55, 44};

        //查找数组中的55元素
        int begin = 0;
        int end = intArr.length - 1;
        int min = (begin + end) / 2;
        while (begin <= end) {
            if (intArr[min] == 55) {
                System.out.println(min);
                break;
            }else if (intArr[min] < 55){
                begin = min + 1;
                min = (begin + end) / 2;
            }else if (intArr[min] > 55){
                end = min - 1;
                min = (begin + end) / 2;
            }

        }
    }
}
