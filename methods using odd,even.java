import java.util.*;
public class Main{
    static boolean check(int n)
    {
        if(n%2==0)
        return true;
        else
        return false;
    }
    
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(check(n))
     System.out.println("EVEN");
     else
      System.out.println("ODD");
    }
}
    
