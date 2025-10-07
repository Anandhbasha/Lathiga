class restaurant{
    void placeOrder(){
        System.out.println("Placed order from Resturant");
    }
}
class vegResturant extends restaurant{
    void placeOrder(){
        System.out.println("Placed order from Veg Resturant");
    }
}
class NVResturant extends restaurant{
    void placeOrder(){
        System.out.println("Placed order from NVResturant");
    }
}
public class polymorphism {
    public static void order(restaurant r){
        r.placeOrder();
    }
    public static void main(String[] args){
        // restaurant res = new restaurant();
        // res.placeOrder();
        // vegResturant vres = new vegResturant();
        // vres.placeOrder();
        // NVResturant nres = new NVResturant();
        // nres.placeOrder();
        restaurant res = new restaurant();
        vegResturant vres = new vegResturant();
        NVResturant nres = new NVResturant();
        order(res);
        order(vres);
        order(nres);
    }
}
