package YiChang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 张雷雷
 * 2022/3/4
 */
public class TiChangChuLi {
    public static void main(String[] args) {
        String text01 = "hello";
        String text02 = "hello动力and字节";
        byte[] bytes01 = new byte[0];
        try {
            bytes01 = text01.getBytes("UTF8");
            System.out.println(Arrays.toString(bytes01));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] bytes02 = new byte[0];
        try {
            bytes02 = text02.getBytes("GBK");
            System.out.println(Arrays.toString(bytes02));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



    }
}
