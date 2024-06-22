import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        // input string
        String str = "geeksforgeeks";

        // output string
        String longestSubStr="";

        // hashmap for storing substrings
        HashMap<String, Integer> subStrHm = new HashMap<>();

        // linked hashmap specially used for storing data sequentially
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        //loop for creating linked hashmap of all the possible sub strings with unique characters
        for(int i=0; i<str.length(); i++){
            //if character does not exist than storing it into hashmap
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), 1);
            }
            //if character already exists, then we are traversing the linked hashmap
            //and appending all the char keys in newKey(will be key for subString hashmap)
            //and length of the newKey will be the value
            else{
                String newKey= "";
                for(Map.Entry<Character,Integer> entry : hm.entrySet()){
                    newKey += String.valueOf(entry.getKey());
                }
                subStrHm.put(newKey, newKey.length());

                // clearing the lined hashmap for next iteration
                hm.clear();
            }
        }
        //fetching maximum value from the subString hashmap
        int longestLengthSubstring = Collections.max(subStrHm.values());

        //fetching key mapped to longestLengthSubstring
        for(Map.Entry<String,Integer> entrySubStr : subStrHm.entrySet()){
            if(entrySubStr.getValue() == longestLengthSubstring){
                longestSubStr = entrySubStr.getKey();
            }
        }

        System.out.println("Length of the Longest Substring Without Repeating Characters: " + longestLengthSubstring);
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubStr);
    }
}
