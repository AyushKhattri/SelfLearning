import java.util.*;
class Anagram {
    public static void main(String[] args) {
        String str1= "ayush";
        String str2= "hayus";
        if(str1.length() != str2.length()){
            System.out.println("Not a anagram");
        }
        else{
            int length = str1.length();
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int i=0; i<length; i++){
                if(!hm.containsKey(str1.charAt(i))){
                    hm.put(str1.charAt(i), 1);
                }
                else{
                    hm.put(str1.charAt(i), (hm.get(str1.charAt(i)+1)));
                }
            }
            for(int i=0; i<length; i++){
                if(hm.containsKey(str2.charAt(i))){
                    hm.put(str1.charAt(i), (hm.get(str1.charAt(i)-1)));
                }
            }
            int c=0; 
            for(Map.Entry<Character,Integer> entry : hm.entrySet()){
                if(entry.getValue() != null){
                    c++;
                }
            }
            if(c==0){
                System.out.println("Given strings are anagram of each other");
            }
            else{
                System.out.println("Given strings are not anagram of each other");
            }
        }
    }
}
