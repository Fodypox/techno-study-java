package unit11.collections.day45.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMethods {
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap = new HashMap<>(Map.of("A",12,"T",61,"I",34,"Y",29,"Z",56,"X",11));
        System.out.println(stringIntegerMap);
        Set<Map.Entry<String,Integer>> entrySet = new HashSet<>();
        entrySet = stringIntegerMap.entrySet();
        System.out.println(entrySet);
        for (Map.Entry<String,Integer>entry:entrySet) {
            System.out.println("Entry: "+entry);
            System.out.println("Key of the entry: "+entry.getKey());
            System.out.println("Value of the entry: "+entry.getValue());
        }
        for (Map.Entry<String,Integer>entry:entrySet) {
            if (entry.getValue()>40){System.out.println(entry);}
            if (entry.getKey().equals("A")||entry.getKey().equals("Z")){System.out.println(entry);}
        }

    }
}
