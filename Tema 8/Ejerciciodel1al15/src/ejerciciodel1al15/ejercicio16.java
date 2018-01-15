/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodel1al15;

/**
 *
 * @author christian
 */
public class ejercicio16 {
    public static void main(String[] args) {

        for (int i = 1; i < 99999; i++) {
            if (ejerciciodel1al15.matematicas.varia.esCapicua(i)) {
                System.out.print(i + "  ");
            }
        }
    }
    
}
