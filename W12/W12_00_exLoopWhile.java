// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 

package W12;

public class W12_00_exLoopWhile {
    public static void main(String[] args) {
        
        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");

        
        // โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
        // 1. ส่วนตัวแปรเริ่มต้น
        // 2. เงื่อนไข
        // 3. การเพิ่มค่า / การลดค่า
        
// TODO1
        
System.out.println("TODO 1 For Loop");
for( int i=1 ; i <= 5 ; i++ ) {
   // คำสั่งที่ต้องการทำซ้ำ
   System.out.println("รอบที่ " + i);

}
System.out.println("===============================");



System.out.println("TODO 1 While Loop");
int n=1;
while (n<=5) {
   System.out.println("รอบที่ " + n);
   n++;
}
System.out.println("===============================");
        
        
// ======================================================================
// TODO2

//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World

        System.out.println("TODO 2 For Loop");
        for(int i = 1; i<=5 ; i++){
            // คำสั่งที่เราต้องทำซ้ำ
            System.out.println("รอบที่ " + i + " Hello World"); 

        }
        System.out.println("===============================");
        
        System.out.println("TODO 2 While Loop");
        int w = 1;
        while (w<=5) {
           System.out.println("รอบที่ " + w + " Hello World");
           w++;
        }
        System.out.println("===============================");



// ======================================================================
// TODO3

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
        System.out.println("TODO 3 For Loop");
        for(int t = 1 ; t <= 10 ; t++ ) {
            // คำสั่งที่เราต้องทำซ้ำ
            System.out.print(t+" ");
        }
        System.out.println("==============================================");

        System.out.println("TODO 3 While Loop");
        int r = 1;
        while (r<=10) {
           System.out.print(r+" ");
           r++;
        }


// ======================================================================

// TODO4

//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

    System.out.println();
    int sum = 0;
     for(int j = 1 ; j <= 10 ; j++ ) {
    // คำสั่งที่เราต้องทำซ้ำ
        System.out.print(j+" ");
        sum = sum + j;
    }
    System.out.println(" = " + sum);


// ======================================================================

// TODO5
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55

    System.out.println("-------TODO 5- For Loop-------");
     sum = 0;
    for(int j = 1 ; j <= 10 ; j++ ) {
    // คำสั่งที่เราต้องทำซ้ำ
        System.out.print(j);
        if (j<10) {
            System.out.print("+");
        }
        sum = sum + j;
}
    System.out.println(" =  " + sum);

    System.out.println("===============================");


    System.out.println("--------TODO 5- While Loop---------");
    sum = 0;
    int k = 1;
    while (k <= 10) {
        System.out.print(k);
        if (k<10) {
            System.out.print("+");
        }
        sum = sum + k;
        k++;
    }
    System.out.println(" =  " + sum);





// ======================================================================


//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

// TODO
    System.out.println();
    sum = 0;
    for(int j = 10 ; j >= 1 ; j-- ) {
    // คำสั่งที่เราต้องทำซ้ำ
    System.out.print(j+" ");
    sum = sum + j;
    }
    



// ======================================================================

//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19

// TODO
 System.out.println();
  sum = 0;
  for(int j = 1 ; j <= 19 ; j += 2 ) {
 // คำสั่งที่เราต้องทำซ้ำ
    System.out.print(j+" ");
    sum = sum + j;
}




// ======================================================================

//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20

// TODO
    System.out.println();
    sum = 0;
    for(int j = 2 ; j <= 20 ; j += 2 ) {
    // คำสั่งที่เราต้องทำซ้ำ
  System.out.print(j+" ");
  sum = sum + j;
}


// ======================================================================

//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100

// TODO
System.out.println();
sum = 0;
for(int i = 1 ; i <= 10 ; i +=2 ) {
// คำสั่งที่เราต้องทำซ้ำ
  System.out.print(i*i+ " ");
  sum = sum + i;
}



// ======================================================================

//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

// TODO
        System.out.println("\n");
        for(int i = 1 ; i <= 5 ; i++) {
            if(i%2 == 0) {
                System.out.println("รอบที่ " + i + " เลขคู่");
            } else {
                System.out.println("รอบที่ " + i + " เลขคี่");
            }
        }
        

// ======================================================================
    }
}