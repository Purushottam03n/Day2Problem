import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args){
        System.out.println("Enter the value a : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter the value b :");
        float b = sc.nextFloat();
        System.out.println("Enter the value c :");
        float c = sc.nextFloat();
        float x1, x2;
        float delta;

        delta = b*b - 4*a*c;


        x1 = (float) (-b + sqrt(delta))/(2*a);
        x2 = (float) (-b - sqrt(delta))/(2*a);

        System.out.println("Root1 is: " +x1);
        System.out.println("Root2 is : " +x2);
    }
}
