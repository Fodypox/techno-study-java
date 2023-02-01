package unit11.collections.day45.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapExamplesAndMethods {
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        Map<String,Integer> stringIntegerMap2 = new HashMap<>(Map.of("A",12,"T",61,"I",34,"Y",29));
        System.out.println(stringIntegerMap2);
        stringIntegerMap2.put("B",16);
        System.out.println(stringIntegerMap2);
        stringIntegerMap2.put("A",6);
        System.out.println(stringIntegerMap2);
        stringIntegerMap2.putIfAbsent("K",41);
        System.out.println(stringIntegerMap2);
        stringIntegerMap2.putIfAbsent("A",41);
        System.out.println(stringIntegerMap2);
        System.out.println(stringIntegerMap2.get("I"));
        System.out.println(stringIntegerMap2.get("X"));
        System.out.println(stringIntegerMap2.getOrDefault("I",0));
        System.out.println(stringIntegerMap2.containsKey("I"));
        System.out.println(stringIntegerMap2.containsKey("X"));
        System.out.println(stringIntegerMap2.containsValue(6));
        System.out.println(stringIntegerMap2.containsValue(666));
        System.out.println(stringIntegerMap2.remove("Y"));
        System.out.println(stringIntegerMap2.remove("Y"));
        System.out.println(stringIntegerMap2.remove("A",6));
        System.out.println(stringIntegerMap2);
        System.out.println(stringIntegerMap2.replace("K",99));
        System.out.println(stringIntegerMap2.replace("X",99));
        System.out.println(stringIntegerMap2);
    }
}
