package W16;
import java.util.Scanner; 
public class W16_posttest_04 {                   //การหาผลรวมตัวเลข

public static void main(String[] args) {

 Scanner kb = new Scanner(System.in);

 int total = 0;  // ทั้งหมด = 0
 for (int i = 0; i < 2; i++) {  //การใช้ for loop

System.out.print("กรุณาใส่จำนวนเต็มที่ " + (i + 1) + ": "); 

int number = kb.nextInt(); 
total += number; } // ผลรวม = ผลรวม + จำนวน
System.out.println("ผลรวมตัวเลข: " + total); // แสดงผล ผลรวม + จำนวน
kb.close(); 
}
 }
