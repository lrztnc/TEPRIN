package Esercizi;

// package VR1;

/**
 * Rrealizzare un programma che calcoli i due numeri più piccoli di una sequenza
 */

public class Esercizio4 {

    /*
    public static int calcMin (int numero) {

        int min1 = Integer.MAX_VALUE; 
        int min2 = Integer.MAX_VALUE;

        do {
            numero = Leggi.unInt();

            if (numero != 0) {
                // System.out.println(numero);

                if (numero < min1) {
                    min1 = min2;
                    min1 = numero;
                } else if (numero < min2) {
                    // min1 = min2;
                    min2 = numero;
                }
            } 

        } while (numero != 0);

        return min1 & min2;
    }

    */
    public static void main(String[] args) {
        int numero = 0;
        /*Avevo già visto fare attraverso questo modo calcolare un numero maggiore o minore  */
        int min1 = Integer.MAX_VALUE; 
        int min2 = Integer.MAX_VALUE;

        System.out.println("Inserisci dei valori, quendo digiti 0 il programma si ferma.");

        /*Ho provato a suddividere l'esercizio con un metodo  */
        // calcMin(numero); 

        do {
            numero = Leggi.unInt();

            if (numero != 0) {
                // System.out.println(numero);

                if (numero < min1) {
                    min1 = min2;
                    min1 = numero;
                } else if (numero < min2) {
                    // min1 = min2;
                    min2 = numero;
                }
            } 

        } while (numero != 0);

        if (min1 != Integer.MAX_VALUE) {
            System.out.println("Il primo numero più piccolo inserito è: " + min1);
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Il secondo numero più piccolo inserito è: " + min2);
        }
    }
}