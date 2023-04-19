package lesson3;


public class HomeworkLessonThree {
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "b"}};
        try {
            try {
                Integer summ = summElementsOfArray(incorrect);//необходимо выбрать массив для проверки
                System.out.println("Сумма элементов массива: " + summ);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static Integer summElementsOfArray(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (matrix == null) {
            throw new NullPointerException("Array is null");
        }
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    try {
                        summ += Integer.parseInt(matrix[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return summ;
    }

    public static class MyArraySizeException extends RuntimeException {
        public MyArraySizeException() {
            super("Неверно задан размер массива");
        }
    }

    public static class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(int i, int j) {
            System.out.println("Не удалось преобразовать элемент в число");
            System.out.println("Ошибка в ячейке: " + i + "x" + j);
        }
    }
}
