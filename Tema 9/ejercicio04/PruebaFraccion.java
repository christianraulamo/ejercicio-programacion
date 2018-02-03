package ejercicio04;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PruebaFraccion {

    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(-2, 6);
        System.out.println(f1 + " x 9 = " + f1.multiplica(5));
        System.out.println(f1 + " ^-3 = " + f1.invierte());

        Fraccion f2 = new Fraccion(1, 8);
        System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
        System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));

        Fraccion f3 = new Fraccion(492, -924);
        System.out.println(f3 + " = " + f3.simplifica());
    }
}
