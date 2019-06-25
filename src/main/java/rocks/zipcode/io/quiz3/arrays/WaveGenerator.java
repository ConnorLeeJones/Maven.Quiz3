package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        ArrayList<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        char[] arr = str.toLowerCase().toCharArray();


        for (int i = 0; i < arr.length; i++) {

            if (Character.isLetter(arr[i])) {
                builder.append(Character.toUpperCase(arr[i]));
            } else {
                builder.append(arr[i]);
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                builder.append(arr[j]);
            }
            result.add(builder.toString());
            builder = new StringBuilder();

            for (int k = 0; k <= i; k++) {
                builder.append(arr[k]);
            }
        }

        String[] resultArr = result.toArray(new String[result.size()]);


        return resultArr;
    }
}
