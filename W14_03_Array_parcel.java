    package W14;
    public class W14_03_Array_parcel {
    public static void main(String[] args) {

        //สร้าง Array เก็บพัสดุ
        String parcel [] = {" 123TH","124EN","125EN","126TH","127EN "};

        //แสดงข้อมูล
        System.out.println("รายการพัสดุ ");
        for(int i = 0 ; i < parcel.length ; i++ ) {
            int count = 0;
            if(parcel[i].endsWith("TH")) {
                System.out.println(i+1 + "." + parcel[i] + " : " + " มาจากประเทศไทย ");
                count++;
            }else {
                System.out.println(i+1 + "." + parcel[i] +" : " + " มาจากต่างประเทศ ");
                count++;
            }
        }
        int countTH = 2;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("พัสดุทั้งหมด = " + parcel.length + " ชิ้น ");

        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("พัสดุที่มาจากประเทศไทย = " + (countTH) + " ชิ้น ");

        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("พัสดุที่มาจากต่างประเทศ = " + (parcel.length - countTH) + " ชิ้น ");
    }
}
