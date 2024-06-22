//to reverse a string
public class ReverseString {
    public static void main(String[] args){
        String str = "Ayush Khattri";
        //through string
        String reversedString="";
        for(int i=(str.length()-1); i>=0; i--){
            reversedString = reversedString + str.charAt(i);
        }
        System.out.println(reversedString);
        //through string builder
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse());
    }
}
