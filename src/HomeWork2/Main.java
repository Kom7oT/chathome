package HomeWork2;
/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения
 * MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 **/
public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"2", "3", "4", "5"},
                {"25", "11", "2", "3"},
                {"1", "9", "16", "14"},
        };

        String[][] arr1 = new String[][]{
                {"2", "3", "4", "5"},
                {"25", "11", "2", "3"},
                {"1", "9", "16", "14"},
                {"1", "9", "ААААА", "14"}
        };

        String[][] arr2 = new String[][]{
                {"2", "3", "4", "5"},
                {"25", "11", "2", "3"},
                {"1", "9", "16", "14"},
                {"1", "9", "16", "14"},
        };

        try {
            System.out.println(arrSum(arr1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Это выполнится в любом случае");

    }

    public static int arrSum(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует требованиям");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException("Размер массива не соответствует требованиям");
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректный элемент в ячейке " + i + " " + j);
                }
            }
        }
        return sum;
    }
}
