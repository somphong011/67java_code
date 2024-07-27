import java.util.Scanner;
public class W04_HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนรัศมีของวงกลม: ");
        double radius = sc.nextDouble();
        //double radius;
        //radius = 10;
        
        double area;
        double PI = 3.14159;
        
        if(radius>0){
            area = PI*radius*radius;
            System.out.println("Area: "+radius+" คือ: "+area);
        } else{
            System.out.println("Error: Please The Radius Number");
        }
    }
}