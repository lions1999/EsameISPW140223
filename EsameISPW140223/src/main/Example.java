package main;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max; // Bug: se costruisco l'array vuoto, il codice restituirà il valore MIN_VALUE di Integer anziché lanciare un'eccezione
    }

    public static int[] addElement(int[] originalArray, int newElement) {
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[originalArray.length] = newElement;
        return newArray;
    }


    public static void main(String[] args) {
        System.out.println("Enter length of array : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = {};
        for (int i = 0; i < length; i++){
            System.out.println("Enter new array number : ");
            numbers = addElement(numbers,scanner.nextInt());
        }
        int result = findMax(numbers);
        System.out.println("Result is "+result);

    }
}
