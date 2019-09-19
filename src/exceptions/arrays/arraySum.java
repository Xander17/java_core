package exceptions.arrays;

public class arraySum {
    public static int sum4X4(String[][] array) throws MySizeArrayException, MyArrayDataException {
        checkArrayDimension(array, 4, 4);
        return getArraySum(array);
    }

    private static void checkArrayDimension(Object[][] array, int i, int j) throws MySizeArrayException {
        if (array.length != 4) throw new MySizeArrayException(i, j);
        for (Object[] insideArray : array)
            if (insideArray.length != 4) throw new MySizeArrayException(i, j);
    }

    private static int getArraySum(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}