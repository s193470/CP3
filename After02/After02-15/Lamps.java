
public class Lamps
{   boolean state;
    
    void state1() {
        state = false;
    }
    
    void state2() {
        state = true;
    }
    
    void state3(){
        System.out.println("Lamp is on:"+state);
    }
    
    public static void main(String[] args){
        Lamps n1= new Lamps();
        Lamps n2= new Lamps();
        
        n1.state1();
        n2.state2();
        n1.state3();
        n2.state3();

    }
    
}
