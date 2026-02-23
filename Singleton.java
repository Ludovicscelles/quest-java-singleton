// class Singleton
public class Singleton {

    // singleton and bank attributes in private
    private static Singleton instance;
    private Bank bank;

    // private constructor with bank initialized to new Bank(0)
    private Singleton() {
        bank = new Bank(0);

    }

    // TODO 1 : fix singleton bad implementation

    // public static getInstance() method that returns the singleton instance
    // if instance is null, create new instance, then return it
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // public methods to open account, deposit, withdraw, get bank and get total

    // openAccount should initialize the bank with the value passed as parameter
    public void openAccount(int value) {
        this.bank = new Bank(value);
    }

    // deposit should add the value to the total in bank,
    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    // withdraw should subtract the value from the total in bank
    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    // getBank should return the bank
    public Bank getBank() {
        return bank;
    }

    // getTotal should return the total in bank
    public int getTotal() {
        return bank.getTotal();
    }
}