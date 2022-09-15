import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args){
        System.out.println("Enter the number you want to reverse: ");
        int numb;
        int rev = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        numb = sc.nextInt();
        for(;numb>0;){
            temp = numb%10;
            rev = rev * 10 + temp;
            numb/=10;

        }
        System.out.println("Reverse of Entered Number is :" +rev);
    }
}
