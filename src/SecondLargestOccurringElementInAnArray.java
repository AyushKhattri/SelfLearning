import java.util.*;

public class SecondLargestOccurringElementInAnArray {

    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,2,2,2,3,3,3,3};
        int maxKey;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.compute(j, (k, existingValue) -> (existingValue + 1));
            }
        }

        System.out.println("Map: " +map);
        //get max value from hashmap
        int maxVal = getMaxValue(map);
        // to get key of  max value
        maxKey = getKeyFromValue(map, maxVal);

        // removing largest key,value pair
        map.remove(maxKey);
//        System.out.println("Updated map: " + map);
        //getting the max from updated map
        System.out.println("Second Largest Occurring Element: " + getKeyFromValue(map,getMaxValue(map)));
    }

    private static int getMaxValue(HashMap<Integer, Integer> map) {
        return Collections.max(map.values());
    }
    private static int getKeyFromValue(HashMap<Integer, Integer> map, Integer value) {
        int key = 0;
        for (Map.Entry<Integer, Integer> traverseMap : map.entrySet()) {
            if (Objects.equals(traverseMap.getValue(), value)) {
                key = traverseMap.getKey();
                break;
            }
        }
        return key;
    }

}
