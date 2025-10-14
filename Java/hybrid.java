public class hybrid {
    public static void main(String[] args){
        sons s  = new sons();
        System.out.println(s.gender);
        s.prints();
        uncles u = new uncles();
        u.prints();
        System.out.println(u.gender);
    }
}

class grandmother{
    char gender = 'F';
    void prints(){
        System.out.println("She is Grandma");
    }
}
class dads extends grandmother{
    char gender = 'M';
}
class uncles extends grandmother{

}
class sons extends dads {

}