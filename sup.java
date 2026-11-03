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
            System.out.println("Balance " + balance);
            super.deposit(500);
            System.out.println("Balance " + balance);
        }
    }
public class sup {    
    public static void main(String[] args) {
        SavingAc s = new SavingAc();
        s.addInterest();
        s.display();
    }

}
