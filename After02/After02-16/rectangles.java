//16.	Define a class for describing rectangles.
// Then create two objects that represents rectangles with dimensions of 3x4
// and 2x7 respectively.//Display their dimensions, perimeters and surface areas.

public class rectangles{
    
    int x;
    int y;
    
    void rectangle1(){
        int x=3;
        int y=4;
        int peri =2*x+2*y;
        System.out.println("Recatangle1"+"\n"+"Dimension "+"\n"+"x:"+" "+x+"\n"+"y: "+y);
        System.out.println("Perimeter: "+peri);
        System.out.println("Surface Area: "+x*y);
    }
    void rectangle2(){
        int x=2;
        int y=7;
        int peri =2*x+2*y;
        System.out.println("Recatangle2"+"\n"+"Dimension "+"\n"+"x:"+" "+x+"\n"+"y: "+y);
        System.out.println("Perimeter: "+peri);
        System.out.println("Surface Area: "+x*y);
    }
    
    public static void main(String[] args){
       rectangles n1 = new rectangles();
       n1.rectangle1();
       n1.rectangle2();
        
    }
}

