package ejercicio06;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PruebaTiempo {

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(2, 10, 50);
        Tiempo t2 = new Tiempo(1, 55, 10);
        Tiempo t3 = new Tiempo(0, 5, 50);

        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
    }
}
