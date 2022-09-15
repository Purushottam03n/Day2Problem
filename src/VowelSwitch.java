import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args){

        char Alpha;
        System.out.println("Enter any Alphabet: ");
        Scanner sc = new Scanner(System.in);
        Alpha = sc.next().charAt(0);
        switch (Alpha){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("You have entered VOWEL");
                break;
                default:
                    System.out.println("You have entered VOWEL");
                break;
        }


    }
}
