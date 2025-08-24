import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        // Example: Creating accounts manually (later can read from CSV)
        accounts.add(new Savings("Alice Johnson", "123456789", 5000));
        accounts.add(new Checking("Bob Smith", "987654321", 2000));

        for (Account acc : accounts) {
            System.out.println("\n*******************");
            System.out.println(acc.showInfo());
        }
    }
}
