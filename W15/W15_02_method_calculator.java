package W15;
import java.util.Scanner;
public class W15_02_method_calculator  {
  
         // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int add(int a, int b) {
        return a + b;
    }

    // 2) Method สำหรับลบเลข
    static int subtract(int a, int b) {
        return a - b;
    }


    // 3) Method สำหรับคูณเลข
    static int multiply(int a, int b) {
        return a * b;
    }


    // 4) Method สำหรับหารเลข
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาป้อนตัวเลขที่ 1 : ");
        int a = sc.nextInt();
        System.out.print("กรุณาป้อนตัวเลขที่ 2 : ");
        int b = sc.nextInt();

        // 1) Method สำหรับบวกเลข
        System.out.println("ผลบวกของตัวเลข "+" = " + add( a, b));

        // 2) Method สำหรับลบเลข
     System.out.println("ผลลบของตัวเลข "+" = " + subtract(a, b));

        

        // 3) Method สำหรับคูณเลข
        System.out.println("ผลคูณของตัวเลข "+" = " + multiply(a, b));
        

        // 4) Method สำหรับหารเลข
        System.out.println("ผลหารของตัวเลข "+" = " + divide(a, b));
        
    }
}
