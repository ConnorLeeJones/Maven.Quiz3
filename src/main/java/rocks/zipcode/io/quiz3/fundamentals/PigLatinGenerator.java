package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] arr = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < arr.length; j++){
            char[] charr = arr[j].toCharArray();
            for (int i = 0; i < charr.length; i++){
                if (!(VowelUtils.hasVowels(arr[j]))){
                    builder.append(arr[j]);
                    builder.append("ay");
                    arr[j] = builder.toString();
                    builder = new StringBuilder();
                    break;
                } else if(VowelUtils.isVowel(charr[0])){
                    builder.append(arr[j]);
                    builder.append("way");
                    System.out.println(builder);
                    arr[j] = builder.toString();
                    builder = new StringBuilder();
                    break;
                } else if (VowelUtils.isVowel(charr[i])) {
                    builder.append(arr[j].substring(i));
                    builder.append(arr[j].substring(0, i));
                    builder.append("ay");
                    System.out.println(builder);
                    arr[j] = builder.toString();
                    builder = new StringBuilder();
                    break;
                }
            }
        }
    return String.join(" ", arr);
    }

}
