package SealedClass;

sealed interface Payment permits UPI, CreditCard {
    void pay();
}


final class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

final class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

// Main class to test
public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new CreditCard();
        p2.pay();
    }
}

