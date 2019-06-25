package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String result = new String(arr);

        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] arr = baseString.toCharArray();
        if (arr[indexOfString] == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        HashSet<String> arr = new HashSet<>();

        for (int i = 0; i < string.length(); i++){
            for (int j = i+1; j <= string.length(); j++){
                arr.add(string.substring(i, j));
            }
        }
        String[] result = new String[arr.size()];
        result = arr.toArray(result);
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
