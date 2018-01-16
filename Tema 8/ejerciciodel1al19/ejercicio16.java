/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodel1al19;

/**
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;

public class ejercicio16 {

    public static void main(String[] args) {

        for (int i = 1; i < 99999; i++) {
            if (ejerciciodel1al19.matematicas.Varia.esCapicua(i)) {
                System.out.print(i + "  ");
            }
        }
    }

}
