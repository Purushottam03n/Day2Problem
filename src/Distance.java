import java.util.Scanner;


public class Distance {
    public static void main(String[] args){
        System.out.println("Enter value x: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        System.out.println("Enter the value y :");
        double y = sc.nextInt();
        double distance ;
        distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance: " +distance);
    }


}
