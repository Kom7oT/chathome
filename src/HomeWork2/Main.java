package HomeWork2;

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
