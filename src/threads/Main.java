package threads;

import java.util.Arrays;

public class Main {
    private static final int ARRAY_SIZE = 10000000;
    private static int threadsCount = 2;
    private static float[] arrayNoMultiThreads = new float[ARRAY_SIZE];
    private static float[] arrayMultiThreads = new float[ARRAY_SIZE];

    public static void main(String[] args) {
        fillArray(arrayNoMultiThreads);
        System.out.println("1 thread:\t" + testNoMultiThreads() + "ms");
        for (threadsCount = 2; threadsCount <= 10; threadsCount++) {
            fillArray(arrayMultiThreads);
            System.out.print(threadsCount + " threads:\t" + testMultiThreads(threadsCount) + "ms.");
            System.out.println("\tCheck equality - " + Arrays.equals(arrayNoMultiThreads, arrayMultiThreads));
        }
    }

    private static void fillArray(float[] arr) {
        Arrays.fill(arr, 1);
    }

    private static long testNoMultiThreads() {
        long time = System.currentTimeMillis();
        recalculateArray(arrayNoMultiThreads);
        return System.currentTimeMillis() - time;
    }

    private static long testMultiThreads(int threadsCount) {
        long time = System.currentTimeMillis();

        Thread[] threads = new Thread[threadsCount];
        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                float[] subArray = getSubArray(arrayMultiThreads, finalI);
                recalculateArray(subArray, finalI);
                joinSubArray(subArray, arrayMultiThreads, finalI);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return System.currentTimeMillis() - time;
    }

    private static float[] getSubArray(float[] arr, int subNum) {
        int splitPoint = getSubArrayStartPoint(subNum);
        int nextSplitPoint = getSubArrayStartPoint(subNum + 1);
        int currentPartSize = (subNum != threadsCount - 1) ? nextSplitPoint - splitPoint : ARRAY_SIZE - splitPoint;
        float[] subArray = new float[currentPartSize];
        System.arraycopy(arr, splitPoint, subArray, 0, currentPartSize);
        return subArray;
    }

    private static int getSubArrayStartPoint(int subNum) {
        return (int) Math.round(1.0 * subNum * ARRAY_SIZE / threadsCount);
    }

    private static void joinSubArray(float[] srcArr, float[] dstArr, int subNum) {
        int joinPoint = getSubArrayStartPoint(subNum);
        System.arraycopy(srcArr, 0, dstArr, joinPoint, srcArr.length);
    }

    private static void recalculateArray(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = getExpression(arr[i], i);
    }

    private static void recalculateArray(float[] arr, int subNum) {
        int startPoint = getSubArrayStartPoint(subNum);
        for (int i = 0; i < arr.length; i++) {
            int newI = startPoint + i;
            arr[i] = getExpression(arr[i], newI);
        }
    }

    private static float getExpression(float x, int y) {
        return (float) (x * Math.sin(0.2f + y / 5) * Math.cos(0.2f + y / 5) * Math.cos(0.4f + y / 2));
    }
}
