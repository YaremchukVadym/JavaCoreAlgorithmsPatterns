package CoreJava.Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bA = new BankAccount(4, "Vadym", 20000.00);

        System.out.println(bA.id);
        System.out.println(bA.name);
        System.out.println(bA.balance);

        System.out.println("______________________");

        bA.id = 34;
        bA.balance = 1500.00;
        bA.name = "Alex";

        System.out.println(bA.id);
        System.out.println(bA.name);
        System.out.println(bA.balance);
    }
}
