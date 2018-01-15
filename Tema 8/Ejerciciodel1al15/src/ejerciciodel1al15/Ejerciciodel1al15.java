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

        // digitoN //////////////////////////////////////////////////////
        System.out.println("En la posición 1 del 27819 está el " + ejerciciodel1al15.matematicas.varia.digitoN(27819, 1));
        System.out.println("En la posición 3 del 92341 está el " + ejerciciodel1al15.matematicas.varia.digitoN(92341, 3));
        System.out.println("En la posición 4 del 212385136 está el " + ejerciciodel1al15.matematicas.varia.digitoN(212385136, 4));
        System.out.println("En la posición 6 del 230108375 está el " + ejerciciodel1al15.matematicas.varia.digitoN(230108375, 6));

        //  posicionDeDigito //////////////////////////////////////////////
        System.out.println("En el 754829, el dígito 8 está en la posición " + ejerciciodel1al15.matematicas.varia.posicionDeDigito(754829, 8));
        System.out.println("En el 456789543, el dígito 9 está en la posición " + ejerciciodel1al15.matematicas.varia.posicionDeDigito(456789543, 9));
        System.out.println("En el 823664012, el dígito 0 está en la posición " + ejerciciodel1al15.matematicas.varia.posicionDeDigito(823664012, 0));
        System.out.println("En el 6012837, el dígito 2 está en la posición " + ejerciciodel1al15.matematicas.varia.posicionDeDigito(6012837, 2));

        // quitaPorDetras /////////////////////////////////////////////////
        System.out.println("Si al 638539123 se le quitan por detrás 4 dígitos, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDetras(638539123, 4));
        System.out.println("Si al 999999 se le quita por detrás 2 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDetras(999999, 2));
        System.out.println("Si al 524682 se le quita por detrás 1 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDetras(524682, 1));
        System.out.println("Si al 7281398 se le quita por detrás 5 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDetras(7281398, 5));

        // quitaPorDelante /////////////////////////////////////////////////
        System.out.println("Si al 638539123 se le quitan por detrás 4 dígitos, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDelante(638539123, 4));
        System.out.println("Si al 999999 se le quita por detrás 2 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDelante(999999, 2));
        System.out.println("Si al 524682 se le quita por detrás 1 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDelante(524682, 1));
        System.out.println("Si al 7281398 se le quita por detrás 5 dígito, se queda como " + ejerciciodel1al15.matematicas.varia.quitaPorDelante(7281398, 5));

        // pegaPorDetras ///////////////////////////////////////////////////
        System.out.println("Si al 5547 se le pega por detrás el 9 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDetras(5547, 9));
        System.out.println("Si al 13 se le pega por detrás el 12 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDetras(13, 12));
        System.out.println("Si al 7 se le pega por detrás el 152 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDetras(7, 152));
        System.out.println("Si al 8901 se le pega por detrás el 1 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDetras(8901, 1));

        // pegarPorDetras //////////////////////////////////////////////////
        System.out.println("Si al 5547 se le pega por detrás el 9 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDelante(5547, 9));
        System.out.println("Si al 13 se le pega por detrás el 12 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDelante(13, 12));
        System.out.println("Si al 7 se le pega por detrás el 152 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDelante(7, 152));
        System.out.println("Si al 8901 se le pega por detrás el 1 da el " + ejerciciodel1al15.matematicas.varia.pegaPorDelante(8901, 1));

        // trozoDeNumero /////////////////////////////////////////////////////
        System.out.println("Al 417654392 le cojo el trozo que va de la posición 1 a la 5: " + ejerciciodel1al15.matematicas.varia.trozoDeNumero(417654392, 1, 5));
        System.out.println("Al 417654392 le cojo el trozo que va de la posición 1 a la 1: " + ejerciciodel1al15.matematicas.varia.trozoDeNumero(417654392, 1, 1));
        System.out.println("Al 417654392 le cojo el trozo que va de la posición 0 a la 2: " + ejerciciodel1al15.matematicas.varia.trozoDeNumero(417654392, 0, 2));
        System.out.println("Al 417654392 le cojo el trozo que va de la posición 6 a la 7: " + ejerciciodel1al15.matematicas.varia.trozoDeNumero(417654392, 6, 7));

        // juntaNumeros //////////////////////////////////////////////////////
        System.out.println("Juntando el 19 y el 31 da el " + ejerciciodel1al15.matematicas.varia.juntaNumeros(19, 31));
        System.out.println("Juntando el 1 y el 900 da el " + ejerciciodel1al15.matematicas.varia.juntaNumeros(1, 900));
        System.out.println("Juntando el 123 y el 980 da el " + ejerciciodel1al15.matematicas.varia.juntaNumeros(123, 980));
        System.out.println("Juntando el 3142 y el 0 da el " + ejerciciodel1al15.matematicas.varia.juntaNumeros(3142, 0));

    }

}
