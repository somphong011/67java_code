//กรณีรับมาหลายค่า (ผ่านลูป)

package W16;
import java.util.Scanner;  //รับค่าจากคีย์บอร์ด
public class W16_Posttest_02 {
   
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); 
int[] numbers = new int[5];
 for (int i = 0; i < 5; i++) { //การใช้ for loop
System.out.print("กรุณาใส่จำนวน " + (i + 1) + ": "); 
numbers[i] = scanner.nextInt(); } System.out.println("ค่าที่คุณใส่คือ: "); 
for (int number : numbers) { 
    System.out.print(number + " ");
 } 
scanner.close();
 }
}

 


