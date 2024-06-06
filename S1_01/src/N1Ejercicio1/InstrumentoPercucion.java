package N1Ejercicio1;

public class InstrumentoPercucion extends N1Ejercicio1.Instrumento {
    public InstrumentoPercucion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "InstrumentoPercucion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String tocar() {
        return "Esta sonando un instumento de percucion.";
    }
}

