/**
 * Ejercicio 13
 *
 * @author Christian Amo
 */

public class Ejercicio13 {
    
    public static void main (String[] args) {
        
        int dadoUno;
        int dadoDos;
        
        do{
            dadoUno = (int)(Math.random()*6) + 1;
            dadoDos = (int)(Math.random()*6) + 1;
            System.out.print(dadoUno);
            System.out.println(dadoDos);
            
            
        }while (dadoUno != dadoDos);
        
    }
}
