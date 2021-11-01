
class books{
    
    String title;
    String author;
    boolean age;
    double price;
    
    
    void displayBookData(){
    System.out.println(title+" "+author+" "+"\n"+"Price: "+price);
    }
    
    void isNew(){
    System.out.println("It's new: "+ age);
    }
    
    public static void main(String[] args) {
    books n1 = new books();
    n1.title="Hobbit";
    n1.author="J.R.R.Tolkien";
    n1.price= 29.99;
    
    n1.displayBookData();
    n1.isNew();
    
    }
}
