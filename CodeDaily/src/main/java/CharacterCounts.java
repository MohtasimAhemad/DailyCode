import java.util.*;

public class CharacterCounts {
    public static void main(String[] args)
    {

        String str="Mohtasim Ahemad";
        Map<Character,Integer> countMap = new HashMap<>();

        str = str.replaceAll("\\s","").toLowerCase();

        for (char c:str.toCharArray()){

            if (countMap.containsKey(c))
            {
                countMap.put(c,countMap.get(c)+1);
            }
            else {
                countMap.put(c,1);
            }
        }
        for(Map.Entry m:countMap.entrySet())
        {
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
