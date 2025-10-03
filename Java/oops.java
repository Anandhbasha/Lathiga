class Cars{
    String CarName;
    int No_of_wheels = 4;
    int Seats;
    int airbags;
    int windows = 4;
    int milages;

    void brake(){
        System.out.println("The"+CarName+"Stopped");
    }
    void acc(){
        System.out.println("The"+CarName+" Now Moving");
    }
}
public class oops {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        Cars c2= new Cars();
        c1.CarName="BMW";
        c1.milages=20;
        c1.Seats=5;
        c1.airbags=6;
        c1.brake();
        c1.acc();
        System.out.println(c1.milages);
        c2.CarName="Maruthi";
        c2.milages=18;
        System.out.println(c2.milages);
        c2.brake();
        c2.acc();
    }
}
