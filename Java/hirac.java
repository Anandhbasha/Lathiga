public class hirac {
    public static void main(String[] args) {
        Dad d = new Dad();
        aunty a = new aunty();
        uncle u = new uncle();
        d.prints();
        u.prints();
        a.prints();
    }
}
 
class grandPa{
    void prints(){
        System.out.println("He is a grandfather");
    }
}
class Dad extends grandPa{

}
class aunty extends grandPa{

}

class uncle extends grandPa{

}