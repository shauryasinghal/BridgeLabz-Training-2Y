
// Problem 2: Bank and Account Holders (Association)
import java.util.*;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;
    List<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 7000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
