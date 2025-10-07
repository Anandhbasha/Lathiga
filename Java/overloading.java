class calculator{
    int total = 0;
    void add(){
        System.out.println("Calc is working");
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a){
        return a;
    }
}


public class overloading {
    public static void main(String[] args){
        calculator cal = new calculator();
        System.out.println(cal.add(10,20,30));
        System.out.println(cal.add(10,20));
        System.out.println(cal.add(10));
        cal.add();
    }
}
