class Account{
    String name;
    int acc;
    double bal;
    Account(String name,int acc,double bal){
        
        this.name=name;
        this.acc=acc;
        this.bal=bal;

    }
    void withdraw(double w){
        System.out.println("");
        System.out.println("Withdrawing... $"+w);
        bal=bal-w;
        System.out.println("New balance $"+bal);
    }
    void deposit(double d){
        System.out.println("");
        System.out.println("Depositing... $"+d);
        bal=bal+d;
        System.out.println("New balance $"+bal);
    }
    void display(){
        System.out.println("");
        System.out.println("Account holder: "+name);
        System.out.println("Account number: "+acc);
        System.out.println("Balance $"+bal);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account obj1=new Account("kalai",486166465,8316.50);
        obj1.display();
        obj1.withdraw(550.5);
        obj1.deposit(10000);
        obj1.display();
        
    }
}
