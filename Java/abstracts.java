abstract class abs{
    abstract void print();
    void newPrints(){
        System.out.println("Welcome");
    }
}
class news extends abs{
    void print(){
        System.out.println("Hello");
    }
    void newPrints(){
        System.out.println("Welcome");
    }
}
public class abstracts {
    public static void main(String[] args) {
        news a = new news();
        a.print();
        a.newPrints();
            
    }
}
