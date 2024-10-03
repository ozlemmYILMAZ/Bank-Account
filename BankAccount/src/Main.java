public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        System.out.println("Başlangıç Bakiyesi: " + myAccount.getBalance());


        myAccount.setbalance(1000);
        System.out.println("Yeni Bakiyesi: " + myAccount.getBalance());


        myAccount.deposit(500);
        myAccount.deposit(-100);


        myAccount.withdraw(200);
        myAccount.withdraw(1500);
        myAccount.withdraw(-50);
    }

}
