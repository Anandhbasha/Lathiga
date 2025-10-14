public class multilevel {
    public static void main(String[] args) {
        son s = new son();
        System.out.println(s.gender);
        s.print();
    }
}
class grandfather{
    String gender = "Male";
    void print (){
        System.out.println("He is Grandfather");
    }
}
class father extends grandfather{

}
class son extends father{
    
}