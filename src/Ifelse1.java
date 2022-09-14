import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args){

        int numb;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        numb = sc.nextInt();

        if( numb ==0 ){
            System.out.println("You have entered ZERO");
        } else if (numb == 1) {
            System.out.println("You have entered ONE");
        } else if (numb == 2) {
            System.out.println("You have entered TWO");
        } else if (numb == 3) {
            System.out.println("You have entered THREE");
        } else if (numb == 4) {
            System.out.println("You have entered FOUR");
        } else if (numb == 5) {
            System.out.println("You have entered FIVE");
        } else if (numb == 6) {
            System.out.println("You have entered SIX");
        } else if (numb == 7) {
            System.out.println("You have entered SEVEN");
        } else if (numb == 8) {
            System.out.println("You have entered EIGHT");
        } else if (numb == 9) {
           System.out.println("You have entered NINE");
        } else {
        System.out.println("You have entered INVALID NUMBER");
        }
    }
}
