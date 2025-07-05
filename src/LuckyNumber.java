import java.util.HashMap;
import java.util.Map;
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//Return the largest lucky integer in the array. If there is no lucky integer return -1.
public class LuckyNumber {
    public void main() {
        int[] arr = {2,2,3,4};
        int luckyInteger=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],(map.get(arr[i])) + 1 );
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> traverseMap : map.entrySet()){
            if(traverseMap.getValue().equals(traverseMap.getKey())){
                luckyInteger = traverseMap.getKey();
            }
        }
        System.out.println(luckyInteger);
    }
}
