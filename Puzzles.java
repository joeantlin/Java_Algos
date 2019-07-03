import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Puzzles {
    public static void main(String[] args) {
        // OneToTwo();
        // OddOne();
        // AllSum();
        int[] myArr = {1,3,5,7,9,13};
        // ItArray(myArr);
        // FindMax(myArr);
        // FindAvg(myArr);
        // GreaterThan(myArr, 6);
        // SqaureVal(myArr);
        // NegNum(myArr);
        // MinMaxAvg(myArr);
        ArrShift(myArr);
    }
    public static void OneToTwo() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }
    public static void OddOne() {
        for (int i = 1; i <= 255; i += 2) {
            System.out.println(i);
        }
    }
    public static void AllSum() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
    public static void ItArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void FindMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void FindAvg(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum;
        System.out.println(avg/arr.length);
    }
    public static void GreaterThan(int[] arr, int y) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static int[] SqaureVal(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] *= arr[i];
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static int[] NegNum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static void MinMaxAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            avg += arr[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.print("Avg: " + (avg/arr.length));
    }
    public static int[] ArrShift(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i+1];
            }
            System.out.println(arr[i]);
            i++;
        }
        return arr;
    }
}