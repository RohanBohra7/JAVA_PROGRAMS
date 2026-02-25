import java.util.*;
public class Negativeexception
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        try{
            if (num<0)
            {
                System.out.println("Negative number not allowed");
            }
        }
    catch(Exception e)
    {
        System.out.println("Exception occured: "+e);
    }
    finally{

        System.out.println("you entered "+num);
    }
        sc.close();
    }
}