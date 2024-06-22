import java.util.*;

public class DuplicateAndDistinctInArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,2,2,2,3,3,3,3};
        ArrayList<Integer> distinctKey = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.compute(j, (k, existingValue) -> (existingValue + 1));
            }
        }
        for(Map.Entry<Integer,Integer> traverseMap : map.entrySet()){
            distinctKey.add(traverseMap.getKey());
        }
        System.out.println(distinctKey);
}}
