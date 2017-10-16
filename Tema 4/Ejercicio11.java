/**
 * Ejercicio 11
 *
 * @author Christian Amo
 */


public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca una hora del día, ");
    System.out.println("primero introduzca la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta");
    //(" la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
  }
}
