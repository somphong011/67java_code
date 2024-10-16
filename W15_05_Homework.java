package W15;
import java.util.Scanner;
public class W15_05_Homework {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("---Factorial Calculator---");
        System.out.print("Enter your number : ");

        int num = kb.nextInt();
        CalculateFactorial(num);
    }

        //สร้าง method สำหรับคำนวณ Factorial และแสดงผลลัพธ์ในตัว 
        static void CalculateFactorial(int num) {
            // 1. สร้างตัวแปรเพื่อเก็บผลลัพธ์ ให้มีค่าเริ่มต้นเป็น 1
            int result = 1;

            //โดยจะคูณเพิ่มขี้นทุกครั้งตามจำนวน เช่น 5! = 5 * 4 * 3 * 2 * 1 = 120 โดยใช้ *= ย่อ result = result * i
            // 2. ให้คำนวณ Factorial จาก 1 ถึง num
            for (int i = 1; i <= num; i++) {
                result *= i;
            
                if (i == num) {
                    System.out.println(num + "! = " + result);
                } else if (i < num) {
                    System.out.print(i + " x ");
                } else {
                    System.out.println("Factorial of " + num + " = " + result);
               CalculateFactorial(5);
                }
        }
    }
}




