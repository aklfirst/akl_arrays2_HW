import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        double sum = 0;
        double averageCost = 0;
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000) + 100_000;
            sum += arr[i];
            System.out.println(arr[i]); // убрать потом
        }
        averageCost = (sum / arr.length) * 1.0;

        int maxCost = arr[0];
        int minCost = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
// Домашнее задание №1
        System.out.println("Total costs for the period was " + sum);
// Домашнее задание №2
        System.out.println("Maximum costs for the period was " + maxCost);
        System.out.println("Minimum costs for the period was " + minCost);
// Домашнее задание №3
        System.out.println("Average daily cost for the period was " + averageCost);
// Домашнее задание №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();

    }
}