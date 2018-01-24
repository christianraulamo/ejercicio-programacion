package ejerciciodel20al28;

/**
 *
 * @author christian
 */
import ejerciciodel20al28.matematicas.Varias;
import java.util.Scanner;

public class ejercicioDel20Al28 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int n = s.nextInt();
        
        System.out.print("Introduce el valor mínimo del array: ");
        int minimo = s.nextInt();
        
        System.out.print("Introduce el valor máximo del array: ");
        int maximo = s.nextInt();

        int[] x;
        x = ejerciciodel20al28.matematicas.Varias.generaArrayInt(n, minimo, maximo);
        ejerciciodel20al28.matematicas.Varias.mostrarArrayInt(x);
        
        System.out.println();
        System.out.println();
        System.out.println("El valor mínimo del array es: " + ejerciciodel20al28.matematicas.Varias.minimoArrayInt(x));
        System.out.println("El valor máximo del array es: " + ejerciciodel20al28.matematicas.Varias.maximoArrayInt(x));
        System.out.println("La media de este array es: " + ejerciciodel20al28.matematicas.Varias.mediaArrayInt(x));

        System.out.print("Introduce el número que quiere comprobar si está: ");
        int numero = s.nextInt();
        
        System.out.println("¿Está en el array? " + ejerciciodel20al28.matematicas.Varias.estaEnArrayInt(x, numero));

        System.out.print("Introduce el número que quieres buscar: ");
        numero = s.nextInt();
        
        System.out.println("Su número está en la posición: " + ejerciciodel20al28.matematicas.Varias.posicionEnArray(x, numero));
        System.out.println("Su array volteado es: ");
        ejerciciodel20al28.matematicas.Varias.volteaArrayInt(x);
        
        System.out.println();
        System.out.println("Introduce el número de posiciones que quieres que rote: ");
        int rotaDer = s.nextInt();
        
        System.out.println("El nuevo array rotado a la derecha es: ");
        int[] rotado;
        
        rotado = ejerciciodel20al28.matematicas.Varias.rotaDerechaArrayInt(x, rotaDer);
        
        for (int i = 0; i < rotado.length - 1; ++i) {
            System.out.print(rotado[i] + " ");
        }
        
        System.out.println();
        System.out.println("Introduce el número de posiciones que quieres que rote: ");
        int rotaIzq = s.nextInt();
        
        System.out.println("El nuevo array rotado a la izquierda es: ");
        rotado = ejerciciodel20al28.matematicas.Varias.rotaIzquierdaArrayInt(x, rotaIzq);
        
        for (int i = 0; i < rotado.length - 1; ++i) {
            System.out.print(rotado[i] + " ");
        }
        System.out.println();
    }
}
