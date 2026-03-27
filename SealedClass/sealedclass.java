package SealedClass;

// Base sealed class
sealed class Vehicle permits TwoWheeler, ThreeWheeler, FourWheeler {
    void display() {
        System.out.println("This is a vehicle");
    }
}

// Sealed subclass
sealed class TwoWheeler extends Vehicle permits EBike {
    @Override
    void display() {
        System.out.println("This is a two wheeler");
    }
}

// Final subclass (no further extension allowed)
final class EBike extends TwoWheeler {
    @Override
    void display() {
        System.out.println("This is an e-bike");
    }
}

// Another subclass of Vehicle
final class ThreeWheeler extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a three wheeler");
    }
}

// Another subclass of Vehicle
final class FourWheeler extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a four wheeler");
    }
}

// Main class to test
public class sealedclass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.display();

        Vehicle v2 = new TwoWheeler();
        v2.display();

        Vehicle v3 = new EBike();
        v3.display();

        Vehicle v4 = new ThreeWheeler();
        v4.display();

        Vehicle v5 = new FourWheeler();
        v5.display();
    }
}