public class Singleton {

    private static Singleton instance;
    private Bank bank;

    private Singleton(){

       bank = new Bank(0);
    }

    // TODO 1 : fix singleton bad implementation
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }



    public void openAccount(int value) {
        this.bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }

    public int getTotal() {
        return bank.getTotal();
    }
}