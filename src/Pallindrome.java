import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        int num2 = numb;
        int rev = 0;
        int temp = 0;

        while(numb>0){
            temp = numb%10;
            rev = rev*10 + temp;
            numb /= 10;
        }
        if(num2==rev){
            System.out.println("Entered Number Pallindrome");
        }
        else{
            System.out.println("Entered Number Not a Pallindrome");
        }
    }

}
