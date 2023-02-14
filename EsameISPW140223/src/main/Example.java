package main;

public class Example {
    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max; // Bug: se l'array è vuoto, il codice restituirà il valore MIN_VALUE di Integer anziché lanciare un'eccezione
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 5 };
        int result = findMax(numbers);
        System.out.println("Result: " + result);
    }
}
