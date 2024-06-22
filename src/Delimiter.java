import java.util.Arrays;

public class Delimiter {
    public static void main(String[] args){
        String str = "875ayu456sh567.345kha789ttri789";
        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
//        String[] arr = str.split("[.]");

//        for(int j=0; j<arr.length; j++){
//            String subStr = arr[j];
//            System.out.println("Substring: " + subStr);
//            reversed.setLength(0);
//            sb.setLength(0);
//            for(int i=0; i<subStr.length(); i++){
//                if(!Character.isDigit(subStr.charAt(i))){
//                    sb.append(subStr.charAt(i));
//                    System.out.println(sb);
//                }
//                else{
//                    reversed.append(sb.reverse() + String.valueOf(subStr.charAt(i)));
//                    System.out.println(reversed);
//                    sb.setLength(0);
//                }
//            }
//            reversed.append(sb.reverse());
//            System.out.println("While replacing array: "  + reversed);
//            arr[j] = String.valueOf(reversed);
//        }
//        System.out.println(Arrays.toString(arr));
//        String reversedString =  String.join(".", arr);
//        System.out.println(reversedString);

        //----------------------------------------BETTER approach---------------------------------
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            else{
                reversed.append(sb.reverse()).append(str.charAt(i));
                sb.setLength(0);
            }
        }
        System.out.println(reversed);
    }
}
