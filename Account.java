public class Account {
    String name;
    String address;
    double balance;
    public void display(){
        System.out.println(name);
        System.out.println(" (");
        System.out.println(address);
        System.out.println(") имеет на сччету $");
        System.out.println(balance);
    }
    public double getInterest(double percentageRate){
        return balance * percentageRate / 100.00;
    }
}
