package javaprojects.interviewquestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRandom {
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        while (integerIntegerHashMap.size() < 10) {
            integerIntegerHashMap.put((int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1));
        }
        System.out.println(integerIntegerHashMap);
        int keySum = 0;
        int valueSum = 0;
        for (Map.Entry<Integer, Integer> entry : integerIntegerHashMap.entrySet()) {
            keySum = keySum + entry.getKey();
            valueSum = valueSum + entry.getValue();
        }
        System.out.println(keySum);
        System.out.println(valueSum);
        /*Set<HashMap.Entry<Integer,Integer>> entrySet = new HashSet<>();
        entrySet = integerIntegerHashMap.entrySet();
        int keySum = 0;
        int valueSum = 0;
        for (HashMap.Entry<Integer,Integer>entry:entrySet) {

        }*/
    }
}
