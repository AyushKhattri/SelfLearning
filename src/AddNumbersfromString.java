import java.util.*;
class AddNumbersfromString {
    public static void main(String[] args) {
        String str = "java123loved111python";
        StringBuilder num= new StringBuilder();
        int  addednum=0;
        boolean previousValueisDigit= true;
        for(int i=0;i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                num.append(str.charAt(i));
            }
            else{
                if(num.length() != 0){
                    addednum += Integer.valueOf(String.valueOf(num));
                    num.setLength(0);
                }
            }
            
        }
        System.out.println(addednum);
    }
}
