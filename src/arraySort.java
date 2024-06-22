import java.util.Arrays;

public class arraySort {
    public static void main(String[] args){
        int[] arr = {6,2,9,5,77,33,1,78,57,0};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //second largest element
        System.out.println((arr[arr.length-2]));
        //second smallest element
        System.out.println((arr[1]));
    }
}
