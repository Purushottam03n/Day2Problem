import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        System.out.println("Enter first Number: ");

        System.out.println("Enter Second Number: ");
        System.out.println("Enter Third Number: ");
        int numb1;
        int numb2;
        int numb3;
        int numb4;
        int numb5;
        int numb6;
        int numb7;

        Scanner sc = new Scanner(System.in);
        numb1 = sc.nextInt();
        numb2 = sc.nextInt();
        numb3 = sc.nextInt();

        numb4 = numb1 + numb2 * numb3;
        numb5 = numb3 + numb1 / numb2;
        numb6 = numb1 % numb2 + numb3;
        numb7 = numb1 * numb2 + numb3;

        if ((numb4 > numb5) && (numb4 > numb6) && (numb4 > numb7)) {
            System.out.println("Max is : " + numb4);
        } else if ((numb5 > numb4) && (numb5 > numb6) && (numb5 > numb7)) {
            System.out.println("Max is: " + numb5);
        } else if ((numb6 > numb4) && (numb6 > numb5) && (numb6 > numb7)) {
            System.out.println("Max is: " + numb6);

        } else {
            System.out.println("Max is: " + numb7);
        }


        if ((numb4 < numb5) && (numb4 < numb6) && (numb4 < numb7)) {
            System.out.println("Min is : " + numb4);
        } else if ((numb5 < numb4) && (numb5 < numb6) && (numb5 < numb7)) {
            System.out.println("Min is: " + numb5);
        } else if ((numb6 < numb4) && (numb6 < numb5) && (numb6 < numb7)) {
            System.out.println("Min is: " + numb6);

        } else {
            System.out.println("Min is: " + numb7);
        }
    }
}