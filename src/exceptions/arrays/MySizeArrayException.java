package exceptions.arrays;

public class MySizeArrayException extends Exception {
    MySizeArrayException(int i, int j) {
        super("Размер массива не соотстветствует размеру " + i + "x" + j);
    }
}
