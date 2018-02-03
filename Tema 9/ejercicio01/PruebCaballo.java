package ejercicio01;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PruebCaballo {

    public static void main(String[] args) {

        Caballo a = new Caballo("Samana", "marrón moteado", 10, 24);
        Caballo l = new Caballo("Pegaso", "negro", 8, 61);

        System.out.println("Hola, me llamo " + a.getNombre());
        a.cabalga();
        a.relincha();

        System.out.println("Hola, yo soy " + l.getNombre());
        l.rumia();
        l.cabalga();
    }
}