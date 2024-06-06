package N1Ejercicio1;

public class Main {
    public static void main(String[] args) {
        N1Ejercicio1.InstrumentoViento flauta = new N1Ejercicio1.InstrumentoViento("Flauta", 100);
        System.out.println(flauta.toString());
        System.out.println(flauta.tocar());

        N1Ejercicio1.InstrumentoCuerda guitarra = new N1Ejercicio1.InstrumentoCuerda("Guitarra", 200);
        System.out.println();
        System.out.println(guitarra.toString());
        System.out.println(guitarra.tocar());

        N1Ejercicio1.InstrumentoPercucion bateria = new N1Ejercicio1.InstrumentoPercucion("Bateria", 300);
        System.out.println();
        System.out.println(bateria.toString());
        System.out.println(bateria.tocar());
    }
}
