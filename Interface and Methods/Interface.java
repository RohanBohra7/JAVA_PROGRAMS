interface MyInterface {

    // Static method
    static void showStatic() {
        System.out.println("Static method");
    }

    // Default method
    default void showDefault() {
        System.out.println("Default method");
    }

    // Abstract method
    void showAbstract();
}

class MyClass implements MyInterface {

    // implementing abstract method
    public void showAbstract() {
        System.out.println("Abstract method implemented");
    }
}

public class Interface {
    public static void main(String[] args) {

        // Call static method
        MyInterface.showStatic();

        MyClass obj = new MyClass();

        // Call implemented method
        obj.showAbstract();

        // Call default method
        obj.showDefault();
    }
}