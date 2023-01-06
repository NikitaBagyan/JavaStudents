package sadao;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Print {

    public void print(int value) {
        System.out.println(value);
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void print(int[] arr){
        String[] star = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            star[i] = String.valueOf(arr[i]);
            String delimeter = " ";
            System.out.println(Arrays.toString(star).split(delimeter));

        }
    }
}
