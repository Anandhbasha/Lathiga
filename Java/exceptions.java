
public class exceptions {
    public static void main(String[] args) {
        // try{
        //     int a = 10;
        //     int b= 0;
        //     System.out.println(a/b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("cannot divide by zero");
        // }
        // // catch(IllegalArgumentException e){
        // //     System.out.println("Enter the integer value");
        // }
        try{
            int [] a = {20,30,40};
            System.out.println(a[2]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index is Invalid");
        }
        finally{
            System.out.println("This is executed");
        }
    }
}
