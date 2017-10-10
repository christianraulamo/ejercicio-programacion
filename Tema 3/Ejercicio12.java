/**
 * Ejercicio 12
 *
 * @author Christian Amo
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    // La nota final se calcula de esta forma:
    // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
    // Por tanto, despejando nota2 tenemos:
    // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
  }
}
