import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    public static void main(String[] args){
        String str = "glwhcebdjbdroiurzfxxrbhzibilmcfasshhtyngwrsnbdpzgjphujzuawbebyhvxfhtoozcitaqibvvowyluvdbvoqikgojxcefzpdgahujuxpiclrrmalncdrotsgkpnfyujgvmhydrzdpiudkfchtklsaprptkzhwxsgafsvkahkbsighlyhjvbburdfjdfvjbaiivqxdqwivsjzztzkzygcsyxlvvwlckbsmvwjvrhvqfewjxgefeowfhrcturolvfgxilqdqvitbcebuooclugypurlsbdfquzsqngbscqwlrdpxeahricvtfqpnrfwbyjvahrtosovsbzhxtutyfjwjbpkfujeoueykmbcjtluuxvmffwgqjgrtsxtdimsescgahnudmsmyfijtfrcbkibbypenxnpiozzrnljazjgrftitldcueswqitrcvjzvlhionutppppzxoepvtzhkzjetpfqsuirdcyqfjsqhdewswldawhdyijhpqtrwgyfmmyhhkrafisicstqxokdmynnnqxaekzcgygsuzfiguujyxowqdfylesbzhnpznayzlinerzdqjrylyfzndgqokovabhzuskwozuxcsmyclvfwkbimhkdmjacesnvorrrvdwcgfewchbsyzrkktsjxgyybgwbvktvxyurufsrdufcunnfswqddukqrxyrueienhccpeuqbkbumlpxnudmwqdkzvsqsozkifpznwapxaxdclxjxuciyulsbxvwdoiolgxkhlrytiwrpvtjdwsssahupoyyjveedgqsthefdyxvjweaimadykubntfqcpbjyqbtnunuxzyytxfedrycsdhkfymaykeubowvkszzwmbbjezrphqildkmllskfawmcohdqalgccffxursvbyikjoglnillapcbcjuhaxukfhalcslemluvornmijbeawxzokgnlzugxkshrpojrwaasgfmjvkghpdyxt";
        StringBuilder subString = new StringBuilder();
        StringBuilder reversedSubString = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();
        String longestPalindromicSubStr="";
        if(str.length()==1){
            System.out.println("longestPalindromicSubStringOneGo: "+ str);
        }
        else if (subString.append(str).compareTo(reversedSubString.append(str).reverse()) == 0) {
            System.out.println("longestPalindromicSubStringOneGo: "+ str);
        }
        else{
            for(int i=0; i<str.length(); i++){
                subString.setLength(0);
                reversedSubString.setLength(0);
                for(int j=i; j<str.length(); j++){
                    reversedSubString.setLength(0);
                    subString.append(str.charAt(j));
                    System.out.println("SubString: " + subString);
                    reversedSubString.append(subString).reverse();
                    System.out.println("ReversedSubString: " + reversedSubString);
                    if(reversedSubString.compareTo(subString) == 0){
                        if(!hm.containsKey(String.valueOf(subString))){
                            hm.put(String.valueOf(subString), String.valueOf(subString).length());
                        }
                    }
                }
            }
        }
        System.out.println(hm);
        //fetching maximum value from the subString hashmap
        int longestPalindromicSubstring = Collections.max(hm.values());

        //fetching key mapped to longestLengthSubstring
        for(Map.Entry<String,Integer> entrySubStr : hm.entrySet()){
            if(entrySubStr.getValue() == longestPalindromicSubstring){
                longestPalindromicSubStr = entrySubStr.getKey();
            }
        }
        System.out.println("longestPalindromicSubString: "+longestPalindromicSubStr);
    }
}
