import java.util.Scanner;

public class ReverseWhile {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        int rev = 0;
        int temp = 0;

        while(numb>0){
            temp = numb%10;
            rev = rev*10 + temp;
            numb /= 10;
        }
        System.out.println("Reverse of Entered Number is: " +rev);

        }
}

