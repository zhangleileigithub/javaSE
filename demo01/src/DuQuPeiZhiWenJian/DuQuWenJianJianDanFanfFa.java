package DuQuPeiZhiWenJian;

import java.util.ResourceBundle;

/**
 * 张雷雷
 * 2022/3/3
 */
public class DuQuWenJianJianDanFanfFa {
    public static void main(String[] args) {
//        使用ResourceBundle的getBundle方法读取文件，不需要写文件的后缀.properties
        ResourceBundle bundle = ResourceBundle.getBundle("resources/file");
        System.out.println(bundle.getString("username"));
        System.out.println(bundle.getString("password"));
        System.out.println(bundle.getString("单位名称"));
    }
}
