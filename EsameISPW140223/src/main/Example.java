package main;

public class Example {
    public static String reverse(String input) {
        return input; // Bug: il codice dovrebbe restituire la stringa invertita, non la stringa originale
    }

    public static void main(String[] args) {
        String result = reverse("Hello, world!");
        System.out.println("Result: " + result);
    }
}
