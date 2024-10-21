package W16;
import java.util.Scanner;
public class W16_posttest_07 { //การรับค่าผ่านรูป ค่าเดี่ยว
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] number = new int[1];

        for (int i = 0 ; i < number.length ; i++ ) {
            System.out.print("Enter Your Number : ");
            number[i] = kb.nextInt();

        }
        kb.close();
    }
    
}
