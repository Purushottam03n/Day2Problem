import java.util.Scanner;

public class Ifelse2 {
    public static void main(String[] args) {
        int numb;

        System.out.println("Please Choose a Number feom 1, 10, 100, 1000");
        Scanner sc = new Scanner(System.in);
        numb = sc.nextInt();

        if (numb == 1) {
            System.out.println("You have entered UNIT/ONES digit");
        } else if (numb == 10) {
            System.out.println("You have entered TENS digit");
        } else if (numb == 100) {
            System.out.println("You have entered HUMDRED digit");
        } else if (numb == 1000) {
            System.out.println("You have entered THOUSAND digit");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}


