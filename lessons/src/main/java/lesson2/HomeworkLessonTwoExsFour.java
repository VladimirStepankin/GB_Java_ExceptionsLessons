package lesson2;

import java.io.*;

public class HomeworkLessonTwoExsFour {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            try {
                String[] strings = {"apple", "orange"};
                String strings1 = strings[2];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверно указан индекс для массива " + e.getMessage());
            }
            try {
                test();
            } catch (StackOverflowError error) {
                System.out.println("Что-то сломалось " + error);
            }
            try {
                int a = 1 / 0;
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя " + e.getMessage());
            }
            try {
                inputStream = new FileInputStream("/broken_reference");
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден " + e.getMessage());
            }
        } catch (Throwable e) {
            System.out.println("Что-то сломалось " + e.getMessage());
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");

    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
