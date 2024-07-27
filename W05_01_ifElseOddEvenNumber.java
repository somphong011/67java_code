import java.util.Scanner;
public class W05_01_ifElseOddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = input.nextInt();
        
        int result = number%2;

        if(result != 0){
            System.out.println("Odd Number: ");
        }else{
            System.out.println("Even Number: ");
        }
        System.out.println("Number: "+result);
    }
}