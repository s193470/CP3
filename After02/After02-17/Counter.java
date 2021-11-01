
public class Counter
{
    int value=0;
   
    
    void incOne(){
        value+=1;
        System.out.println(value);
    }    
    
    void decOne(){
        value-=1;
        System.out.println(value);
    }
    
    void incTen(){
        value+=10;
        System.out.println(value);
    }
    
    void decTen(){
        value-=10;
        System.out.println(value);
    }
    
    void resetCounter(){
        value= 0;
    }

    public static void main(String[] args){
        Counter n1= new Counter();
        Counter n2= new Counter();
        n1.incTen();
        n1.incTen();
        n1.incOne();
        n1.incOne();
        n1.incOne(); //23
        n2.decTen();
        n2.decTen();
        n2.decTen();
        n2.decTen();//-40
        n2.decTen();
        n2.incOne();
        n2.incOne();
        n2.incOne();//-47
    }
}
