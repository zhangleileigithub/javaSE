package JiHe;

import java.util.*;

/**
 * 张雷雷
 * 2022/3/3
 */
public class MapJiHe {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Collection list02 = new ArrayList();
        ArrayList list03 = new ArrayList();

        Map hashMap = new HashMap();
        hashMap.put(null, "123");
        hashMap.put("张三", null);
        hashMap.put(null, null);
        for (Object entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        Map hashTable = new Hashtable();
//        hashTable.put(null, "123");  //hashTable的键和值都不可以为null
        hashTable.put("张三", null);  //hashTable的键和值都不可以为null
        for (Object entry : hashTable.entrySet()) {
            System.out.println(entry);
        }

    }
}
