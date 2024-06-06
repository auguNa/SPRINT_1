package N1Ejercicio8;

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = str -> {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        };
        String originalString = "Hello, Barcelona!";
        String reversedString = reverser.reverse(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
