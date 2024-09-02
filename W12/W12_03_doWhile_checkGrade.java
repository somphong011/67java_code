package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int Score;

       // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน

       // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.print("Enter your score between 1 and 100  : ");
            Score = kb.nextInt();
         
        } while (Score < 1 || Score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด
        if(Score >= 80) {
            System.out.println("your grade is A");
        }else if(Score >= 75) {
            System.out.println("your grade is B+");
        }else if(Score >= 70) {
            System.out.println("your grade is B");
        }else if(Score >= 65) {
            System.out.println("your grade is C+");
        }else if(Score >= 60) {
            System.out.println("your grade isC");
        }else if(Score >= 55) {
            System.out.println("your grade is D+");
        }else if(Score >= 50) {
            System.out.println("your grade is D");
        }else {
            System.out.println("your grade is F");
        }

        kb.close(); // ปิด Scanner object
    }
}