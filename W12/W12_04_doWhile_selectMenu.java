package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {
    public static void main(String[] args) {
        // ประกาศ Scanner object
        Scanner kb = new Scanner(System.in);

        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก
        int choice = 0;
 
        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
            // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
            do {
                
                            // แสดงเมนู
                            System.out.println("====================================");
                            System.out.println("Menu:");
                            System.out.println("1. Addition");
                            System.out.println("2. Subtraction");
                            System.out.println("3. Exit");
                            System.out.println("====================================");
                            
                choice = kb.nextInt();
                System.out.println("Enter your choice : ");

            } while (choice < 1 || choice > 3);

        

            // รับค่าเลือกเมนู
                // แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
            System.out.println("------------------------------------");
            
            
      
             


        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        switch (choice) {
            case 1:     // ถ้าผู้ใช้เลือก 1
                System.out.print("Enter the first number: ");
                int num1 = kb.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = kb.nextInt();

                int sum = num1 + num2;
                System.out.println("The sum is " + sum);
                break;

                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num1
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num2
                // คำนวณผลรวม
                // แสดงผลรวม
                // ออกจาก switch
            case 2:
            System.out.println("Enter the first number: ");
            int num3 = kb.nextInt();
            System.out.println("Enter the second number: ");
            int num4 = kb.nextInt();
            int difference = num3 - num4;
            System.out.println("The difference is " + difference);
            break;
            
            case 3:
                System.out.println("Goodbye!");
                break;
            
            default:    // ถ้าผู้ใช้เลือกเมนูอื่น
            System.out.println("Invalid choice! rty again.");
                // แสดงข้อความเลือกเมนูไม่ถูกต้อง
        }while(choice != 3);

        // ปิด Scanner object
    }  
}