import java.util.*;
public class Main{
    public static void main (String[] args) {
        int arr[]={55,33,66,88,22,11,5,1};
        int i,num=11,len=arr.length;
        for(i=0;i<len;i++){
        if(arr[i]==num){
         System.out.print("element found at position:"+i);
         return;
        }
        }
        System.out.print("elementn not found");
    }
}
