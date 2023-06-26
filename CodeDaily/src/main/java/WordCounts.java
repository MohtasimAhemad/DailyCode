import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounts {

    public static void main(String[] args) {
        String str = "today is 4th day of week today is wonderful day";
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] words = str.split(" ");
        for (String word : words)
        {
            Integer integer = map.get(word);
            if (integer == null)
                map.put(word, 1);
            else
            {
                map.put(word, integer + 1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> m:map.entrySet())
        {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

//        Map<String,Long> wordCounts = Arrays.stream(str.split(" "))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(wordCounts);
//
//        Map<String,Long> sortedWordCounts = new TreeMap<>(Comparator.naturalOrder());
//        sortedWordCounts.putAll(wordCounts);
//        System.out.println(sortedWordCounts);


    }

}