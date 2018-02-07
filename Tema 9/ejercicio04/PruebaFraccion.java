package ejercicio04;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PruebaFraccion {

    public static void main(String[] args) {

        Fraccion nueva = new Fraccion(40, 100);

        nueva.invierte();
        nueva.simplifica();
        nueva.multiplica(7);
        nueva.divide(5);
    }
}
