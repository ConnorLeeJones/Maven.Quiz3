package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    //private final Class<SomeType> type;


    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType t : array){
            if (getNumberOfOccurrences(t) % 2 == 1){
                return t;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType t : array){
            if (getNumberOfOccurrences(t) % 2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for (SomeType t : array){
            if (t.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> toFilter = Arrays.asList(array);
        List<SomeType> filtered = toFilter.stream().filter(f -> predicate.equals(true)).collect(Collectors.toList());

                //.filter(filtered -> )
                ;
        //SomeType[] result = new SomeType[filtered.size()];


        //SomeType[] result = (SomeType[]) filtered.toArray();



        //List<SomeType> toFilter = Arrays.asList(array);
        //SomeType[] newArr = (SomeType[]) Arrays.stream(array).filter(f -> predicate.equals(true)).toArray();
        //SomeType[] result = (SomeType[]) Array.newInstance(Class<SomeType> type, filtered.size());

        //SomeType[] newArr = genericConvert(this.type, filtered);

        return null;
    }



    public static <SomeType> SomeType[] genericConvert(Class<SomeType> type, List<SomeType> input){

        @SuppressWarnings("unchecked")
        SomeType[] result = (SomeType[]) Array.newInstance(type, input.size());

        int i = 0;
        for (SomeType t : input){
            result[i] = t;
            i++;
        }
        return result;
    }




}
