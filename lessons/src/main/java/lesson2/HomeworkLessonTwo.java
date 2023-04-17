package lesson2;

import java.util.Scanner;

public class HomeworkLessonTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания для проверки (1,2,3 или 4: )\n");
        int num = scan.nextInt();
        switch (num) {
            case 1 -> exerciseOne();
            case 2 -> exerciseTwo();
            case 3 -> exerciseThree();
            case 4 -> exerciseFour();
            default -> System.out.println("Введен неверный номер");
        }
    }

    private static void exerciseFour() {
        HomeworkLessonTwoExsFour.main(null);
    }

    private static void exerciseThree() {
        HomeworkLessonTwoExsThree.main(null);
    }

    private static void exerciseOne() {
        Scanner scan = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите дробное число");
            try{
                float number = Float.parseFloat(scan.nextLine());
                System.out.println("Ваше число: " + number);
                work=false;
            }catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }
        }
    }

    private static void exerciseTwo() {

        try {
            int d = 0;
            int[] intArray = {1,2,3,4,5,6,7,8,9};// необходимо инициализировать массив
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
