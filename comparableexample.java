import java.util.*;
class Student  implements Comparable<Student>
{
    int roll, marks;
    String Name;
    Student(int r, int m, String N)
    {
        this.roll=r;
        this.marks=m;
        this.Name=N;
    }
     public int compareTo(Student other) {
        if (this.marks == other.marks) {
            return this.roll - other.roll; // tie-breaker by roll
        }
        return other.marks - this.marks; // descending order of marks
    }

}
public class comparableexample {
    public static void main(String[] args) {
        List<Student>s=new ArrayList<>(5);
        s.add(new Student(1,90,"Rohan"));
        s.add(new Student(40, 70, "Shivam"));
        s.add(new Student(20, 90, "Pankaj"));
        s.add(new Student(24, 60, "Umesh"));
        s.add(new Student(60, 30, "Varun"));

        for(Student i:s)
        System.out.println(i.roll+" "+i.marks+" "+i.Name);

    }
}
