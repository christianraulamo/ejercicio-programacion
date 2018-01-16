package ejerciciodel1al19;

/**
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;
import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long decimal = 0;

        System.out.print("Introduzca un número binario: ");
        int binario = s.nextInt();

        int bits = ejerciciodel1al19.matematicas.Varia.digitos(binario);

        for (int i = 0; i < bits; i++) {
            decimal += ejerciciodel1al19.matematicas.Varia.digitoN(binario, bits - i - 1) * ejerciciodel1al19.matematicas.Varia.potencia(2, i);
        }

        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
