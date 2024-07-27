import java.util.Scanner; //นำเข้าคลาส Scanner จาก package java.util
public class W04_01_AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บข้อมูล

        // double radius; // ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 10;   // กำหนดค่ารัศมีเป็น 10
        
        double area;   // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI=3.14159; // ประกาศค่าคงที่

        area = PI*radius*radius; // คำนวณพื้นมที่ของวงกลม
        System.out.println("พื้นที่วงกลมทั้งหมดที่มีรัศมีเท่ากับ"+radius+" คือ "+area);
    }
}