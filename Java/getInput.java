import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int a = s.nextInt();
        System.out.println(a);
        float b = s.nextFloat();
        System.out.println(b);
        s.close();
    }
    
}
