import java.util.HashMap;
import java.util.Map;

// to count the occurrence of characters in a string
public class CountOccurrence {
    public static void main(String[] args){
        String str = "aaaaabbbcccc";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                int existingValue = map.get(str.charAt(i));
                map.put(str.charAt(i),(existingValue+1));
            }
        }
        for(Map.Entry<Character,Integer> traverseMap : map.entrySet()){
            if(traverseMap.getValue()>1){
                System.out.println(traverseMap.getKey() + ": " + traverseMap.getValue());
            }
        }

    }
}
