public class Main {
    public static void main(String[] args) {

//        =====Task 1=====
        System.out.println("=====Task 1=====");
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }

//        =====Task 2=====
        System.out.println("\n=====Task 2=====");
        for (int i = 10; i != 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
//        =====Task 3=====
        System.out.println("=====Task 3=====");
        for (int i = 2; i < 17; i += 2) {
            System.out.print(i + " ");
        }

//        =====Task 4=====
        System.out.println("\n=====Task 4=====");
        for (int i = 10; i != -11 ; i--) {
            System.out.print(i + " ");
        }

//        =====Task 2-1=====
        System.out.println("\n=====Task 2-1=====");
        for (int i = 1904; i < 2097 ; i +=4) {
            System.out.print(i + " ");
        }

 //        =====Task 2-2=====
        System.out.println("\n=====Task 2-2=====");
        for (int i = 1; i < 15; i++) {
            System.out.print(i * 7 + " ");
        }
//        =====Task 2-3=====
        System.out.println("\n=====Task 2-3=====");
        for (int i = 1; i < 512; i += i ) {
            System.out.print(2 * i + " ");
        }
//        =====Task 3-1=====
        System.out.println("\n=====Task 3-1===== ");
        int salary = 29000;
        int total;
        for (int i = 1; i <= 12; i++) {
            total = salary * i;
            System.out.println("Month " + i + ": Amount of savings is " + total + " rub.");
        }
//        =====Task 3-2=====
        System.out.println("=====Task 3-2===== ");
        int salary1 = 29000;
        int total1;
        for (int i = 1; i <= 12; i++) {
            total1 = i * salary1;
            total1 = total1 * (100 + i) / 100;
            System.out.println("Month " + i + ": Amount of savings is " + total1 + " rub.");
        }




    }

}