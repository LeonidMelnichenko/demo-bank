package src;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = "Барри";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;
        myAccount.bank = "БПС-Банк";
        yourAccount.name = "Джейн";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;
        yourAccount.bank = "Приорбанк";
        myAccount.display();
        System.out.print(" плюс $");
        System.out.print(myAccount.getInterest(5.00));
        System.out.println(" дохода ");
        yourAccount.display();
        double yourInterestRate = 7.00;
        System.out.print(" плюс $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.println(" дохода ");
    }
}