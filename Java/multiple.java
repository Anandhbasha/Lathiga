interface A{
    void add();
    default void prints(){
        System.out.println("This A Class");
    }
}

interface B{
    default void prints(){
        System.out.println("This B Class");
    }
}
class C implements A,B{
    public void add(){
        System.out.println("Multiple works");
    }
    public void prints(){
        A.super.prints();
        B.super.prints();
    }
}
public class multiple {
        public static void main(String[] args){
        C obj = new C();
        obj.prints();
        obj.add();
    }
}
