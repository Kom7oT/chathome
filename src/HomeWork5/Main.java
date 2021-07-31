package HomeWork5;

import java.util.Arrays;

public class Main {
    private static void singleThread(float[] arr) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long singleTime = System.currentTimeMillis() - start;
        System.out.printf("1 поток: %d\n", singleTime);
    }

    private static void multiThread(float[] arr) {
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread t1 = new MyThread("a1", a1);
        MyThread t2 = new MyThread("a2", a2);

        t1.start();
        t2.start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long multiTime = System.currentTimeMillis() - start;

        System.out.printf("2 потока: %d\n", multiTime);
    }

    private static final int size = 1000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {
        Arrays.fill(arr, 1);
        singleThread(arr);
        multiThread(arr);
    }

}

class MyThread extends Thread {
    private float[] arr;

    MyThread(String name, float[] arr) {
        super(name);
        this.arr = arr;
    }

    @Override
    public void run() {
        calculate();
    }

    private void calculate() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}