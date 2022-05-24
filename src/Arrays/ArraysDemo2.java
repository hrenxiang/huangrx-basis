package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Charon
 * @date 2020/7/10
 **/
public class ArraysDemo2 {

    public static void main(String[] args) {
        Map<String, String> s = new HashMap<String, String>();

        s.put("001", "黄任翔");
        s.put("002", "周润发");
        s.put("003", "刘德华");
        s.put("004", "郭富城");
        s.put("005", "黎明");

        Set<Map.Entry<String, String>> entries = s.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
