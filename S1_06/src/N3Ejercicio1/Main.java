package N3Ejercicio1;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        Generic generic = new Generic();
        generic.usePhone(myPhone);

        generic.useSmartphone(myPhone);
    }
}
