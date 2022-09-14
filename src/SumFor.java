import java.util.Scanner;

public class SumFor {
    public static void main(String[] args){
        int numb;
        int sum = 0;
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        numb = sc.nextInt();
        for(int i=0; i<=numb; i++){
            sum += i;

        }
        System.out.println("Sum is :" +sum);
    }

}
