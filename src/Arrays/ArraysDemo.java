package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50,25,15,35,45};

        Arrays.sort(arr);

        String s = Arrays.toString(arr);

        //System.out.println(s);
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        for (int i = 0; i < stooges.size(); i++) {
            System.out.println(stooges.get(i));
        }
    }
}
