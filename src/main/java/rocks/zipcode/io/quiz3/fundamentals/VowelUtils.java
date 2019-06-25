package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return !word.matches("[^AEIOUaeiou]+");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (isVowel(arr[i]))
                return i;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return (hasVowels(character.toString()));
    }
}
