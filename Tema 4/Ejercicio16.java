/**
 * Ejercicio 16
 *
 * @author Christian Amo
 */


public class Ejercicio16 {

  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("TEST DE FIDELIDAD");
    System.out.print("Este programa te dirá si hay probabilidad");
    System.out.println(" de que tu pareja está siendo infiel.\n");

    System.out.print("1. Tu pareja parece estar más inquieta de lo");
    System.out.print(" normal sin ningún motivo aparente.\n(v) si es");
    System.out.print(" verdadero o (f) se es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario");
    System.out.print(".\n(v) si es verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba ");
    System.out.print("anteriormente por ti.\n(v) si es verdadero o");
    System.out.print(" (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia");
    System.out.print(" (si es hombre) o ahora se arregla el pelo y");
    System.out.print(" se asea con más frecuencia (si es mujer)");
    System.out.print(".\n(v) si es verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("5. No te deja que mires la agenda de su");
    System.out.print(" teléfono móvil.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer");
    System.out.print(" contestar cuando estás tú delante.\n(v) si es");
    System.out.print(" verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("7. Últimamente se preocupa más en cuidar la");
    System.out.println(" línea y/o estar bronceado/a.\n(v) si es");
    System.out.print(" verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar");
    System.out.print(" porque dice tener mucho más trabajo.\n(v) si");
    System.out.print(" es verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("9. Has notado que últimamente se perfuma");
    System.out.print(" más.\n(v) si es verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en");
    System.out.print(" sitios donde no ha ido contigo.\n(v) si es");
    System.out.print(" verdadero o (f) si es falso: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
  
    // Muestra el resultado del test
    
    if ( puntos <= 10 ) {
      System.out.print("¡Enhorabuena! tu pareja parece ser");
      System.out.print(" totalmente fiel.");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("Quizás exista el peligro de otra persona en");
      System.out.print(" su vida o en su mente, aunque seguramente");
      System.out.print(" será algo sin importancia. No bajes la guardia.");    
    }
    
    if ( puntos >= 22 ) {
      System.out.print("Tu pareja tiene todos los ingredientes para");
      System.out.print(" estar viviendo un romance con otra persona.");
      System.out.print(" Te aconsejamos que indagues un poco más y");
      System.out.println(" averigües qué es lo que está pasando por");
      System.out.println(" su cabeza.");
    }
  }
}
