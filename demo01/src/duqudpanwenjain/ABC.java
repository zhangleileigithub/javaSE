package duqudpanwenjain;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 张雷雷
 * 2022/3/4
 */
public class ABC {
    public static void main(String[] args) {
        /*
        * 创建读取流
        * 根据字节读取
        * 根据字节读取文件中的1024个字节数(长度)，保存到bytes数组中
        * 把bytes数组中的从0~num的字节根据 GBK编码 转换成为 String类型的字符串
        * 输出
        * 判断abc.txt文件中字节数是否已经读取完成，由此经过可以循环可以读取文件中所有的字节
        * */
        try {
            FileInputStream fis = new FileInputStream("d/abc.txt");
            byte[] bytes = new byte[1024];
            int num = fis.read(bytes);
            while (num != -1) {
                String s = new String(bytes, 0, num, "GBK");
                System.out.println(s);
                num = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
