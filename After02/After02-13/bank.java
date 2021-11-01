

public class bank
{
    String name;
    String PESEL;
    String gender;
    double money;
    double newMoney;
    
    void displayName(){
        System.out.println(name+" "+PESEL+" "+gender);
    }
    
    void displayMoney(){
        System.out.println("You have: "+money);
    }
    
    void addMoney(){
        double sum=(money+newMoney);
        System.out.println("New account balance is;"+ sum);
    }
}
