package N1Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Barcelona");
        strings.add("Golf");

        List<String> stringsWithO = StringFinder.findStringsWithO(strings);
        System.out.println("Strings containing 'o': " + stringsWithO);
    }
}
