package ua.levelup;

import java.util.Scanner;

// class takes array from file "array.txt" and waits for sorting variant from user
// 1 - sort by BUBBLES method
// 2  -sort by SELECTION method
public class MainSort {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Scanner scanner = new Scanner(System.in);
        ArrayUtils arrayUtils = new ArrayUtils();

        int[]unsorted = arrayUtils.returnArray();

        arrayUtils.printArray(unsorted, "Unsorted array: ");

        int[]sorted = new int[unsorted.length];

        int variant = 1;

        while (variant==1 || variant==2) {
            System.out.println("Input 1 to sort SELECTION or 2 to sort BUBBLE or any other number to quit:");
            variant = scanner.nextInt();

            switch (variant){
                case 1:
                    sorted = sorter.sortArray(unsorted, new SortSelection());
                    arrayUtils.printArray(sorted, "SELECTION variant: ");
                    break;
                case 2:
                    sorted = sorter.sortArray(unsorted, new SortBubble());
                    arrayUtils.printArray(sorted, "BUBBLE variant: ");
                    break;
            }
        }
    }
}
