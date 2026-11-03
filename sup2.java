class BankAc {
        int balance = 1000;

        void deposit(int amt) {
            balance += amt;
        }
    }

    class SavingAc extends BankAc {
        void addInterest() {
            balance = balance + 100;
        }

        void display() {
            BankAc b = new BankAc();
            System.out.println("Balance " + balance);
            System.out.println("Balance " + b.balance);
        }
    }
public class sup2 {    
    public static void main(String[] args) {
        SavingAc s = new SavingAc();
        s.addInterest();
        s.display();
    }

}
