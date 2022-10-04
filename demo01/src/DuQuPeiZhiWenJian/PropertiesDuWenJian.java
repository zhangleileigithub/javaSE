package DuQuPeiZhiWenJian;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 张雷雷
 * 2022/3/3
 */
public class PropertiesDuWenJian {
    public static void main(String[] args) throws IOException {
        /**
         * 流通道与配置文件连接
         * 新建properties对象
         * 使用properties加载流通道，此时properties通过 流通道 与 配置文件相连接
         * 通过properties读取配置文件中的信息
         * 关闭流通道
         *
         * */
        Properties properties = new Properties();

        /*
        * 通多当前线程的类加载器进行创建流通道
        *InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resources/file.properties");
        * */

//        通过类字节码文件的类加载器与配置文件建立流通道
        InputStream inputStream = PropertiesDuWenJian.class.getClassLoader().getResourceAsStream("resources/file.properties");
//        通过流通道加载配置文件
        properties.load(inputStream);
//        读取属性
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("单位名称"));
//        关闭通道
        inputStream.close();
    }
}
