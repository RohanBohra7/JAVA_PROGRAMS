import java.util.*;
import java.util.stream.*;
class StreamAPI
{
    public static void main(String args[])
    {
        List<Integer> obj=new  ArrayList<>();
        System.out.println("Enter 10 integers");
        for(int i=0; i<10; i++)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            obj.add(n);
        }
        obj.stream().sorted().forEach(x->System.out.println(x));
        Set<Integer> sortedObj=obj.stream().collect(Collectors.toSet());
        sortedObj.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
    }
}