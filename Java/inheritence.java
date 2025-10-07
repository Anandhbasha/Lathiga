class parent{
    protected int a =20;
    void printing(){
        System.out.println("Inherritence");
    }
}
class son extends parent{
    void printing1(){
        System.out.println("Inherritence Son");
        System.out.println(a);
    }
}
public class inheritence {
    public static void main(String[] args) {
        son s = new son();
        s.printing();
        s.printing1();
        s.a=60;
    }
}
