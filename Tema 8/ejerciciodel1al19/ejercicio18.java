package ejerciciodel1al19;

/**
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;
import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
        int decimal = s.nextInt();

        System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");

    }

    /**
     * Pasa un número decimal (en base 10) a binario (base 2).
     *
     * @param decimal número entero en base 10
     * @return número inicial pasado a binario
     */
    public static long decimalABinario(int decimal) {

        if (decimal == 0) {
            return 0;
        }

        long binario = 1;

        while (decimal > 1) {
            binario = ejerciciodel1al19.matematicas.Varia.pegaPorDetras(binario, decimal % 2);
            decimal = decimal / 2;
        }
        binario = ejerciciodel1al19.matematicas.Varia.pegaPorDetras(binario, 1);
        binario = ejerciciodel1al19.matematicas.Varia.voltea(binario);
        binario = ejerciciodel1al19.matematicas.Varia.quitaPorDetras(binario, 1);

        return binario;

    }
}
