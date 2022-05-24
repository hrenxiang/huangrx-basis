package ClassLoder;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Charon
 * @date 2020/9/13
 */
public class TestDemo {

    public static void main(String[] args) throws FileNotFoundException {

        Properties pro = new Properties();

        InputStream fr = TestDemo.class.getClassLoader().getResourceAsStream("hrx.properties");

        try {
            pro.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class<?> className = Class.forName(pro.getProperty("ClassName"));

            Object o = className.getDeclaredConstructor().newInstance();

            Method met = className.getMethod(pro.getProperty("MethodName"));

            met.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
