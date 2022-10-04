package shuzu;

/**
 * 张雷雷
 * 2022/3/1
 */
public class ErWeiShuZu {
    public static void main(String[] args) {
        int[] intArr01 = {11,22,33};
        int[] intArr02 = {22,33};
        int[] intArr03 = {0,1,2,3,4,5};
        
        int[][] twoIntArr01 = new int[5][10];
        int[][] twoIntArr02 = {intArr01,intArr02,intArr03};

        for (int i = 0; i < twoIntArr02.length; i++) {
            for (int j = 0; j < twoIntArr02[i].length; j++) {
                System.out.print(twoIntArr02[i][j]);
            }
            System.out.println();
        }
        
    }
}
