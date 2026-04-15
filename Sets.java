import java.util.*;
public class Sets {
    public static void main(String[] args) {
    Set<Integer> s=new HashSet<>();
    s.add(10);
    s.add(20);

    Iterator<Integer> it=s.iterator();
    while(it.hasNext())
        System.out.println(it.next());
    }
}
