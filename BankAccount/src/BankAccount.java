public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setbalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else{
            System.out.println("Bakiye negatif olamaz!");
        }
    }
    public void deposit(double amount){
        if (amount>0){
            balance+= amount;//bakiyeyi arttır
            System.out.println("Yeni bakiye:"+ balance);
        }else {
            System.out.println("Yatırılacak miktar pozitif olmalıdır.");

        }

    }
    //bakiye azaltma metodu
    public  void withdraw(double amount){
        if (amount>0&& amount<=balance){
            balance -= amount; // Bakiyeyi azalt
            System.out.println("Yeni bakiye"+balance);
        }else if (amount>balance){
            System.out.println("Yetersiz bakiye.");
        }else {
            System.out.println("Çekilecek miktar pozitif olmalıdır.");
        }
    }
}
