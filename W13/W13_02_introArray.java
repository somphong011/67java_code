package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //ประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] BrandsCars = new String[3];
        //กำหนดค่าให้ตัวแปร Array
        BrandsCars[0] = "Toyota";
        BrandsCars[1] = "Nissan";
        BrandsCars[2] = "Honda";
        
        //แก้ใขค่าใน Array โดยรับค่าจากคีย์บอร์ด
        System.out.println("\nPlease enter the brand of cars : ");
        for(int i = 0 ; i < BrandsCars.length ; i++ ) {
            System.out.print("Enter brand " + (i+1) + " : ");
            BrandsCars[i] = kb.next();
        }
        //แสดงผลโดยใช้ index ของ Array 
        System.out.println("\n");
        System.out.println("====================================================================================================");
        System.out.print("\nNew Brand of cars in the array : ");
        for(String car : BrandsCars) {
            System.out.print(car  + " / ");
}
}
}


