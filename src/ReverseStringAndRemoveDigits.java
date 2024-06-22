//to reverse a string and remove digits
public class ReverseStringAndRemoveDigits {
    public static void main(String[] args){
        String str = "A5yu3sh 2Kha9tt6ri0";
        String reversedString="";
        for(int i=(str.length()-1); i>=0; i--){
            if(!Character.isDigit(str.charAt(i))){
                reversedString = reversedString + str.charAt(i);
            }
        }
        System.out.println(reversedString);
    }
}
