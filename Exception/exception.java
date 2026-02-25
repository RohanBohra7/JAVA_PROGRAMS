import java.util.*;
public class exception {
    public static void main(String[] args) {
        int [] arr={21,5,67,9,90,45,23};
        int idx, a,ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index and value");
        try
        {
            idx=sc.nextInt();
            a=sc.nextInt();
            ans=arr[idx]/a;


        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Occured: "+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Occured: "+e);
        }
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("Ans="+ans);
        sc.close();
    }
}
