import java.util.*;
public class Main{
    public static void main(String[]args){
        int arr[]={33,77,44,99,22,66,11};
        int i,j,temp,len=arr.length;
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
