package ejerciciodel1al15;

/**
 * Ejercicio
 *
 * @author christian
 */
import ejerciciodel1al15.matematicas.varia;

public class Ejerciciodel1al15 {

    public static void main(String[] args) {

        // Capicua ////////////////////////////////////////
        if (ejerciciodel1al15.matematicas.varia.esCapicua(451)) {
            System.out.println("El 451 es capicúa");
        }

        if (ejerciciodel1al15.matematicas.varia.esCapicua(237732)) {
            System.out.println("El 237732 es capicúa");
        }
        if (ejerciciodel1al15.matematicas.varia.esCapicua(2732)) {
            System.out.println("El 2732 es capicúa");
        }
        if (ejerciciodel1al15.matematicas.varia.esCapicua(110011)) {
            System.out.println("El 110011 es capicúa");
        }

        // esPrimo///////////////////////////////////////////
        if (ejerciciodel1al15.matematicas.varia.esPrimo(11)) {
            System.out.println("El 11 es primo");
        }

        if (ejerciciodel1al15.matematicas.varia.esPrimo(834)) {
            System.out.println("El 834 es primo");
        }
        if (ejerciciodel1al15.matematicas.varia.esPrimo(31)) {
            System.out.println("El 31 es primo");
        }
        if (ejerciciodel1al15.matematicas.varia.esPrimo(25)) {
            System.out.println("El 25 es primo");
        }

        // elSiguienteEsPrimo /////////////////////////////////
        System.out.println("El siguiente primo mayor a 31 es " + ejerciciodel1al15.matematicas.varia.siguientePrimo(31));
        System.out.println("El siguiente primo mayor a 89 es " + ejerciciodel1al15.matematicas.varia.siguientePrimo(89));
        System.out.println("El siguiente primo mayor a 55 es " + ejerciciodel1al15.matematicas.varia.siguientePrimo(55));
        System.out.println("El siguiente primo mayor a 68 es " + ejerciciodel1al15.matematicas.varia.siguientePrimo(68));

        // Potencia //////////////////////////////////////////
        System.out.println("2^10 = " + ejerciciodel1al15.matematicas.varia.potencia(5, 11));
        System.out.println("5^(-3) = " + ejerciciodel1al15.matematicas.varia.potencia(7, 3));
        System.out.println("10^6 = " + ejerciciodel1al15.matematicas.varia.potencia(9, -6));

        // digitos ////////////////////////////////////////////////
        System.out.println("El número 65 tiene " + ejerciciodel1al15.matematicas.varia.digitos(65) + " dígito/s.");
        System.out.println("El número 456787654 tiene " + ejerciciodel1al15.matematicas.varia.digitos(456787654) + " dígito/s.");
        System.out.println("El número 1 tiene " + ejerciciodel1al15.matematicas.varia.digitos(1) + " dígito/s.");
        System.out.println("El número 7248842 tiene " + ejerciciodel1al15.matematicas.varia.digitos(7248842) + " dígito/s.");

        // voltea /////////////////////////////////////////////////
        System.out.println("El 76 volteado es " + ejerciciodel1al15.matematicas.varia.voltea(76));
        System.out.println("El 567843 volteado es " + ejerciciodel1al15.matematicas.varia.voltea(567843));
        System.out.println("El -789543678 volteado es " + ejerciciodel1al15.matematicas.varia.voltea(-789543678));
        System.out.println("El 398 volteado es " + ejerciciodel1al15.matematicas.varia.voltea(398));

    }

}
