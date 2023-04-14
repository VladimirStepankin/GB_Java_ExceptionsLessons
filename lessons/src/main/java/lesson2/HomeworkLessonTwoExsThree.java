package lesson2;

public class HomeworkLessonTwoExsThree {
    public static void main(String[] args) {//убрал throws Exception
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            System.out.println(ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." + ex.getMessage());//перенес Throwable
        }
    }

    public static void printSum(Integer a, Integer b) {//убрал throws Exception
        System.out.println(a + b);
    }
}
