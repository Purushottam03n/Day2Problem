import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        System.out.println("Enter the month: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Enter Day: ");
        int day = sc.nextInt();

        if((month == 3 && day >20 && day< 31) || (month == 4 && day>=1 && day <=30)||(month == 5 && day>=1 && day<+31) ||(month == 6 && day<=20)){
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
