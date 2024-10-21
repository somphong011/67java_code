package W16;                               //จำนวนเต็มบวก ลบ ศูนย์
import java.util.Scanner; 
public class W16_posttest_03 { 
public static void main(String[] args) { 
Scanner kb = new Scanner(System.in);
 System.out.print("กรุณาใส่จำนวนเต็ม: ");
  int number = kb.nextInt(); 
if (number > 0) {  //ถ้า number มากกว่า 0 ให้แสดงจำนวนเต็มบวก
     System.out.println("จำนวนเต็มบวก");
 } else if (number < 0) {      //ถ้า number น้อยกว่า 0 ให้แสดงจำนวนเต็มลบ
    System.out.println("จำนวนเต็มลบ"); 
} else { 
    System.out.println("ศูนย์"); 
}
 kb.close(); 
}
 }
