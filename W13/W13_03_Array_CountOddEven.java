package W13;
public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {

        //ให้นับจำนวนเลขคู่และจำนวนเลขคี่ ใน Array ด้านล่าง
        int [] numbers = {1,2,4,6,7,9,77,88,99,45,34,23,57,89,12,90};

        int countOdd = 0;
        int countEven = 0;
        for(int i = 0 ; i < numbers.length ; i++ ) {
            System.out.print(numbers[i] + " ");
            if(numbers[i] % 2 == 0) {
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("\nAmount of all numbers : " + numbers.length);
        System.out.println("\nAmount of all Odd numbers : " + countOdd);
        System.out.println("\nAmount of all Even numbers : " + countEven);
    }
}
