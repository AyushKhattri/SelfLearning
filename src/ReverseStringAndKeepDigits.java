public class ReverseStringAndKeepDigits {
    public static void main(String[] args){
        String str = "java32loves76python100"; //expectedOutput = avaj32sevol76nohtyp100
        StringBuilder reversedString=  new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            else{
                reversedString.append(sb.reverse()).append(str.charAt(i));
                sb.setLength(0);
            }
        }

        //----------------------------------------BETTER approach---------------------------------
//        for(int i=0; i<str.length(); i++){
//            if(Character.isLetter(str.charAt(i))){
//                sb.append(str.charAt(i));
//            }
//            else{
//                reversedString.append(sb.reverse()).append(str.charAt(i));
//                sb.setLength(0);
//            }
//        }
        System.out.println(reversedString);
    }
}