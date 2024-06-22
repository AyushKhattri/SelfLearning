public class ShortForm {
static {
    System.out.println("Before main");
}
    public static void main(String[] args){
        String str = "Japneet Singh Sachdeva";
        String[] arr = str.split(" ");
        StringBuilder resultant= new StringBuilder();
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(i!=(len-1)){
               resultant.append(arr[i].charAt(0)).append(".");
            }
            else{
                resultant.append(" ").append(arr[i]);
            }
        }
        System.out.println(resultant);
    }
}
