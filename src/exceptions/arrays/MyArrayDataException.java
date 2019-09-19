package exceptions.arrays;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int i, int j) {
        super("Ячейка [" + i + ", " + j + "] массива не может быть преобразована в число");
    }
}