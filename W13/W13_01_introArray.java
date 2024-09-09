package W13;
public class W13_01_introArray {
    public static void main (String[] args) {
        //ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        String [] colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
        int [] banks = {20,50,100,500,1000};
        char [] Alphabet = {'a','b','c','d','e'};

        //แสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The second bank is : " + banks[1]);
        System.out.println("The third alphabet is : " + Alphabet[2]);
        System.out.println("The first color is : " + colors[0]);
        System.out.println("====================================================================");
        //แสดงผลโดยใช้ loop
        System.out.print("Colors in the array : ");
        for(int i = 0 ; i < 7 ; i++ ) {
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n");
        System.out.println("====================================================================");
        System.out.print("\nColors in the array : ");
        for(int i = 6 ; i >= 0  ; i-- ) {
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n");
        System.out.println("====================================================================");
        System.out.print("Banks in the Array :");
        for(int i = 0 ; i < banks.length ; i++ ) {
            System.out.print(banks[i] + " ");
        }
    }
}
