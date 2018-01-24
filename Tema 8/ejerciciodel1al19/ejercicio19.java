package ejerciciodel1al19;

/**
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;
import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la base de origen: ");
        System.out.println("1.- Decimal.");
        System.out.println("2.- Binario.");
        System.out.println("3.- Hexadecimal.");
        System.out.println("4.- Octal.");
        int tipoOrigen = s.nextInt();

        System.out.print("Introduce el número que quiere cambiar de base: ");
        int numero = s.nextInt();

        System.out.println("Ahora escriba el a que tipo quiere cambiar: ");
        System.out.println("1.- Decimal.");
        System.out.println("2.- Binario.");
        System.out.println("3.- Hexadecimal.");
        System.out.println("4.- Octal.");
        int tipoFinal = s.nextInt();

        if (tipoOrigen == 1) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número ya está en decimal.");
                    break;
                case 2:
                    System.out.println("Su número en binario es: " + ejerciciodel1al19.matematicas.Varia.binario(numero));
                    break;
                case 3:
                    System.out.println("Su número en hexadecimal es: " + ejerciciodel1al19.matematicas.Varia.hexadecimal(numero));
                    break;
                case 4:
                    System.out.println("Su número en octal es: " + ejerciciodel1al19.matematicas.Varia.octal(numero));
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }

        if (tipoOrigen == 2) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número en decimal es: " + ejerciciodel1al19.matematicas.Varia.decimal(numero));
                    break;
                case 2:
                    System.out.println("Su número ya está en binario.");
                    break;
                case 3:
                    numero = ejerciciodel1al19.matematicas.Varia.decimal(numero);
                    System.out.println("Su número en hexadecimal es: " + ejerciciodel1al19.matematicas.Varia.hexadecimal(numero));
                    break;
                case 4:
                    numero = ejerciciodel1al19.matematicas.Varia.decimal(numero);
                    numero = ejerciciodel1al19.matematicas.Varia.octal(numero);
                    System.out.println("Su número en octal es: " + numero);
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }

        if (tipoOrigen == 3) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número en decimal es: " + ejerciciodel1al19.matematicas.Varia.hexaDec(numero));
                    break;
                case 2:
                    numero = ejerciciodel1al19.matematicas.Varia.hexaDec(numero);
                    System.out.println("Su número en binario es: " + ejerciciodel1al19.matematicas.Varia.binario(numero));
                    break;
                case 3:
                    System.out.print("Su número ya está en hexadecimal.");
                    break;
                case 4:
                    numero = ejerciciodel1al19.matematicas.Varia.hexaDec(numero);
                    System.out.println("Su número en octal es: " + ejerciciodel1al19.matematicas.Varia.octal(numero));
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }

        if (tipoOrigen == 4) {
            switch (tipoFinal) {
                case 1:
                    numero = ejerciciodel1al19.matematicas.Varia.octalDec(numero);
                    System.out.println("Su número en decimal es: " + numero);
                    break;
                case 2:
                    numero = ejerciciodel1al19.matematicas.Varia.octalDec(numero);
                    numero = ejerciciodel1al19.matematicas.Varia.binario(numero);
                    System.out.println("Su número en binario es: " + numero);
                    break;
                case 3:
                    numero = ejerciciodel1al19.matematicas.Varia.octalDec(numero);
                    System.out.println("Su número en hexadecimal es: " + ejerciciodel1al19.matematicas.Varia.hexadecimal(numero));
                    break;
                case 4:
                    System.out.print("Su número ya está en octal.");
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }
    }
}
