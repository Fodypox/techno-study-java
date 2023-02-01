package unit11.collections.day45.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ViewCollectionsOfMap {
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap = new HashMap<>(Map.of("A",12,"T",61,"I",34,"Y",29,"Z",56,"X",11));
        System.out.println(stringIntegerMap);
        Set<String> stringSet = new HashSet<>();
        stringSet = stringIntegerMap.keySet();
        System.out.println(stringSet);
        System.out.println("Set of the keys: "+stringIntegerMap.keySet());
        System.out.println("Collection of the values: "+stringIntegerMap.values());
        System.out.println("Set of the entries: "+stringIntegerMap.entrySet());
    }
}
