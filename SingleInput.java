import java.util.Scanner;

public class SingleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        for ( int i = 0 ; number.length ; i++) {
            System.out.print("กรุณาใส่จำนวนเต็ม: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                valid = true;
                break; // ออกจากลูปเมื่อได้รับค่าที่ถูกต้อง
            } else {
                System.out.println("ค่าไม่ถูกต้อง กรุณาใส่จำนวนเต็มอีกครั้ง.");
                scanner.next(); // ทิ้งค่าที่ไม่ถูกต้อง
            }
        }

        System.out.println("คุณใส่ค่า: " + number);
        scanner.close();
    }
}
