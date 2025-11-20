class Cars{
    String CarName;
    int No_of_wheels = 4;
    int Seats = 5;
    int airbags = 6;
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
        Cars x1 = new Cars();
        Cars x3 = new Cars();
        x1.CarName="BMWX1";
        x1.milages=20;
        x3.CarName="BMWX3";
        x3.milages=25;
        x1.acc();
        x3.acc();
        System.out.println(x1.milages);
        System.out.println(x3.milages);
    }
}
