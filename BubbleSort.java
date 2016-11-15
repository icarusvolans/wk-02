import java.util.*;

/**
 * Created by icarusvolans on 11/15/16.
 */
public class BubbleSort {

    public static void main(String[] args) {

            //create an int array we want to sort using bubble sort algorithm
        int intArray[] = new int[]{5,90,35,45,150,3};

            //print array before sorting using bubble sort algorithm
        System.out.println("Array Before Bubble Sort");
        System.out.println(Arrays.toString(intArray));

        // TODO: loop through the array and print the values

        System.out.println(" "); // just adding a space for readability

            //sort an array using bubble sort algorithm
        bubbleSort(intArray);

            //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        System.out.println(Arrays.toString(intArray));

            // TODO: loop through the array and print the values

        }

    private static void bubbleSort(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {

            for (int j = 0; j < (intArray.length - 1); j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }

            }

        /*
         * In bubble sort, we basically traverse the array from first
         * to array_length - 1 position and compare the element with the next one.
         * Element is swapped with the next element if the next element is greater.
         *
         * Bubble sort steps are as follows.
         *
         * 1. Compare array[0] & array[1]
         * 2. If array[0] > array [1] swap it.
         * 3. Compare array[1] & array[2]
         * 4. If array[1] > array[2] swap it.
         * ...
         * 5. Compare array[n-1] & array[n]
         * 6. if [n-1] > array[n] then swap it.
         *
         * After this step we will have largest element at the last index.
         *
         * Repeat the same steps for array[1] to array[n-1]
         *
         */

            // TODO: logic goes here
        }

    }
}

