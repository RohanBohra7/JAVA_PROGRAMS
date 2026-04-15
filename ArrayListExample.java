import java.util.*;

class customizesort implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        // checks for positive, nagtive and zero
        //positive=swap
        //negative=NO swap
        //zero=NO swap

        //example return a-b if a=5 and b=3 and it will swap for positive (for ascending btw)
        //example return b-a for the above condition for descending swapping

        if((a%2==0 && b%2!=0))
        return 1;

       if((a%2!=0 && b%2==0))
        return -1;

       return a-b;

    }
}

public class ArrayListExample {
    public static void main(String args[])
    {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.add(90);
        list1.add(100);
        System.out.println("List1 created is :" +list1);

        //copying into new list
         List<Integer>list=new ArrayList<>(list1);
         System.out.println("List created is :" +list);

         //modifying list
         list1.set(3,5);
         list.addFirst(0);
         System.out.println("Updated List created is :" +list);

         //remove common elements
         list.removeAll(list1);
         System.out.println("List created is :" +list);

         //adding values to sort the list
         list.add(2);
         list.add(2,8);

         list.sort(null);//sorts in ascending
        System.out.println("Updated List created is :" +list);

        //for descending order
        list.sort(new customizesort());// click on sort f12 for backend operations
        System.out.println("Updated List created is :" +list);

        //lambdaexp
        list.sort((a,b)->b-a);


        //for segregating even and odd
        list.sort(new customizesort());// click on sort f12 for backend operations
        System.out.println("Updated List created is :" +list);

    }

}
