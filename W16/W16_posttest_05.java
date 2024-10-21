package W16;
import java.util.Scanner;     //เลขคู่ เลขคี่
public class W16_posttest_05 { 
public static void main(String[] args) {
 Scanner kb = new Scanner(System.in); 
System.out.print("กรุณาใส่จำนวนเต็ม: ");
 int number = kb.nextInt();
 if (number % 2 == 0) { // หารด้วย 2 ลงตัว
 System.out.println("Even number"); 
 }else { 
    System.out.println("Odd number"); 
} 
kb.close(); 
}
}
