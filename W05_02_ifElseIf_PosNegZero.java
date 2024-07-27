import java.util.Scanner;
public class W05_02_ifElseIf_PosNegZero {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int number = input.nextInt();

    if(number>0){
        System.out.println(number + " is Positive: ");
    } else if(number<0){
        System.out.println(number + " is Negative: "); 
    }
    else if(number == 0) {
        System.out.println(number + " is Zero: ");
    } else{
        System.out.println("Invalid Input");
    }
}
}
