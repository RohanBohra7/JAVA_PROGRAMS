 class Student {
    int id;
    String name;
    static String college = "ABESEC";

    // default constructor
    // Student() {
    //     id = 0;
    //     name = "Not Assigned";
    // }


    // Parameterized Constructor
    public Student(int id, String name) {
        this.id = id;// this resolves naming conflict between instance variable and parameter
        this.name = name;
    }

    void display()
    {
        System.out.println("ID:" +id);
        System.out.println("name: "+ name);
        System.out.println("College: "+college);
    }
}
public class ConstructorDemo{
    public static void main(String[] args) {
        Student s1=new Student("id: "+id, name:" name);
        s1.display();
    }
}


