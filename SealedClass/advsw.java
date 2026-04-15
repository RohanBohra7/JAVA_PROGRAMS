package SealedClass;
import java.util.*;
public class advsw {
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();

        String s= switch(str)
        {
            case "Admin"-> "Full Access";
            case "User"-> "Limited Access";
            case "Guest" -> "Read Only";
            case "Other" -> "No Access";
            default -> "Unknown Access";
        };
        System.out.println(s);
        sc.close();
    }
    
}
