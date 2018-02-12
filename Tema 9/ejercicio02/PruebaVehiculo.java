package ejercicio02;

/**
 * Ejercicio
 *
 * @author christian
 */
import java.util.Scanner;

public class PruebaVehiculo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcion = 0;
        int km;

        Bicicleta paco = new Bicicleta(9);
        Coche juan = new Coche(1900);

        while (opcion != 8) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");

            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = s.nextInt();
                    paco.recorre(km);
                    break;
                case 2:
                    paco.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = s.nextInt();
                    juan.recorre(km);
                    break;
                case 4:
                    juan.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos ");
                    System.out.println(paco.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(juan.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
            }
        } 
    }
}
