package src;

public class Account {
    String name;
    String address;
    String bank;
    double balance;
    public void display(){
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") имеет на счету $");
        System.out.print(balance);
        System.out.print(" в ");
        System.out.print(bank);
        System.out.print("е");
    }
    public double getInterest(double percentageRate){
        return balance * percentageRate / 100.00;
    }
}
