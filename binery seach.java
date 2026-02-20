import java.util.*;
public class Main {
    public static void main(String[]args){
        int arr[]={33,22,44,55,66,11,77};
        int i,mid,start=0,end=arr.length,target=1;
        while(start<=end){
            mid=(start+end)/2;
            if(target==arr[mid]){
                System.out.print(mid);
               return;
            } 
            else if(arr[mid]<target)
            start=mid+1;
            else if(arr[mid]>target)
            end=mid-1;
        }
            System.out.println(-1);
}

}   


 
