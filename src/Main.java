public class Main {

    public static void main(String[] args) {
        // task № 1

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла" + i);
        }
        // task № 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // task № 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Четные числа" + i);
        } // task № 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }  // task № 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Год являеться высокосным" + i);
        } // task № 6
        for (int i = 0; i <= 98; i = i + 7) {
            System.out.println("Последовательность чисел" + i);
        }// task № 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println("Последовательность чисел" + i);
        }// task № 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total ;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }// task № 9
        int salary2 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++){
            total1 = total1 + total1 / 100;
        total1 = total1 + salary2;
        System.out.println(" Месяц " + i + " Cумма накоплений равна " + total1 + " рублей");
        }// task № 10
        for (int i = 2; i <=20; i = i +2) {
            System.out.println("Последовательность чисел" + i);
        }
        }
    }
