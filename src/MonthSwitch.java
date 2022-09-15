import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args){
        int year;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        switch(year){
            case 1:
                System.out.println("JANUARY");
            case 2:
                System.out.println("FEBRUARY");
            case 3:
                System.out.println("MARCH");
            case 4:
            case 5:
                System.out.println("MAY");
            case 6:
                System.out.println("JUNE");
            case 7:
                System.out.println("JULY");
            case 8:
                System.out.println("AUGUST");
            case 9:
                System.out.println("SEPTEMBER");
            case 10:
                System.out.println("OCTOBER");
            case 11:
                System.out.println("NOVEMBER");
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INVALID  MONTH NUMBER");
                break;
        }

    }
}
