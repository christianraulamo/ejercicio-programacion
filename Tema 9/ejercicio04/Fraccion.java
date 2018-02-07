package ejercicio04;

/**
 *
 * @author christian
 */
public class Fraccion {

    int numerador;
    int denominador;
    int copiaNumerador;
    int copiaDenominador;
    int copiaNumerador2;
    int copiaDenominador2;
    int copiaNumerador3;
    int copiaDenominador3;
    int div;
    int divFinal;

    Fraccion(int x, int y) {
        numerador = x;
        copiaNumerador = x;
        denominador = y;
        copiaDenominador = y;
        copiaNumerador2 = x;
        copiaDenominador2 = y;
        copiaNumerador3 = x;
        copiaDenominador3 = y;
    }

    void invierte() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
        System.out.println("Al invertir la fracción queda: " + numerador
                + "/" + denominador);
        aux = denominador;
        denominador = numerador;
        numerador = aux;
    }

    void simplifica() {
        if (copiaNumerador < copiaDenominador) {
            for (div = 1; div < copiaDenominador; div++) {
                if ((copiaNumerador % div == 0) && (copiaDenominador % div == 0)) {
                    divFinal = div;
                    copiaNumerador /= div;
                    copiaDenominador /= div;
                }
            }
            System.out.println("Al simplificar entre el número " + divFinal
                    + " queda como: " + copiaNumerador + "/" + copiaDenominador);
        }
        if (copiaDenominador < copiaNumerador) {
            for (div = 1; div < copiaNumerador; div++) {
                if ((copiaNumerador % div == 0) && (copiaDenominador % div == 0)) {
                    divFinal = div;
                    copiaNumerador /= div;
                    copiaDenominador /= div;
                }
            }
            System.out.println("Al simplificar entre el número " + div
                    + " queda como: " + copiaNumerador + "/" + copiaDenominador);
        }
        if (copiaDenominador == copiaNumerador) {
            div = copiaNumerador;
            copiaNumerador /= div;
            copiaDenominador /= div;
            System.out.println("Al simplificar entre el número " + div
                    + " queda como: " + copiaNumerador + "/" + copiaDenominador);
        }
    }

    void multiplica(int a) {
        copiaNumerador2 *= a;
        copiaDenominador2 *= a;
        System.out.println("Al multiplicar la fracción por " + a + " es: "
                + copiaNumerador2 + "/" + copiaDenominador2);
    }

    void divide(int div) {
        if ((numerador % div == 0) && (denominador % div == 0)) {
            copiaNumerador3 = copiaNumerador3 / div;
            copiaDenominador3 = copiaDenominador3 / div;
            System.out.println("Al dividir la fracción entre " + div + " es: "
                    + copiaNumerador3 + "/" + copiaDenominador3);
        }
    }
}
