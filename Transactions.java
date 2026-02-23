// class Transactions
public class Transactions {

    // public static void transactions() and balance() methods
    // transactions() should call singleton and do some transactions
    public static void transactions() {

        Singleton singleton = Singleton.getInstance();

        singleton.withdraw(300);
        singleton.deposit(12);
        singleton.deposit(54);
        singleton.withdraw(47);
    }

    // balance() should call singleton and get total, then print it
    public static void balance() {

        // TODO 2 : call singleton and get total

        Singleton singleton = Singleton.getInstance();

        int total = singleton.getTotal();


        System.out.printf("Your balance is:%d%n", total);
    }
}
