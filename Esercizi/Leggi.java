package Esercizi;
// che epackage VR1;
import java.io.*; // L'* sono tutte le funzioni input/output del modulo java. è la controparte di include <stdio.h>.

public class Leggi {
  
  /*
   * Questa dichiarazione è usata spesso usata. Stiamo dchiarando dei modificatori di visibilità.
   * Sto dichiarando un oggetto dal nome br.
   * New è la keyword che indica il linguaggio di distanziare lo spazio di memoria.
   *  String s = new String("ciao"); Il new richiede il costruttore.
   * 
   * [Da imparare a memoria]
  */

  private static BufferedReader br = 
    new BufferedReader(new InputStreamReader(System.in)); // Grazie a java.io* posso usare System, queste classi servono per gestire l'imput.
  private static String s; // Grazie a questa funzione posso gestire tutta la stringa.

  public static boolean unBoolean() {
    input(); // Richiamiamo input che restituisce una stringa

    /*
     * Se s non è stato dato un valore (input ha fallito) essco dall'if. 
     * Se s non è uguale nè a true e nè a false, allora non è un boolean. Se è uguale a true è true, se uguale a false allora è false.
     * 
     * !true -> false
     * !false -> true
    // 
     */
 
    if (s != null && !s.equals("true") // Controllo per verificare se s è nulla, 
                  && !s.equals("false"))
      System.err.println("Errore: "+s+" non e' un boolean"); // Se non è nè true nè false diamo che non è un tipo di dato boolean.
    return s!=null && s.equals("true");
  }
  public static byte unByte() {
    try {
      return Byte.parseByte(input());
    } catch (NumberFormatException e) {
      if (s!=null) System.err.println("Errore: "+s+
                                      " non e' un byte");
      return 0;
    }
  }
  public static short unoShort() {
    try {
      return Short.parseShort(input());
    } catch (NumberFormatException e) {
      if (s!=null) System.err.println("Errore: "+s+
                                      " non e' uno short");
      return 0;
    }
  }

  /*
   * Input è quella parte di codice che ci fa inserire un numero, e lui vuole come input una stringa. Input è dichiarata in un altra funzione nel file. 
  */

  public static int unInt() {
      return Integer.parseInt(input()); 
  }
  public static long unLong() {
    try {
      return Long.parseLong(input());
    } catch (NumberFormatException e) {
      if (s!=null) System.err.println("Errore: "+s+
                                      " non e' un long");
      return 0;
    }
  }
  public static float unFloat() {
    try {
      return Float.parseFloat(input());
    } catch (NumberFormatException e) {
      if (s!=null) System.err.println("Errore: "+s+
                                      " non e' un float");
    } catch (NullPointerException e) {}
    return 0;
  }
  public static double unDouble() {
    try {
      return Double.parseDouble(input());
    } catch (NumberFormatException e) {
      if (s!=null) System.err.println("Errore: "+s+
                                      " non e' un double");
    } catch (NullPointerException e) {}
    return 0;
  }
  public static char unChar() {
    try {
      return input().charAt(0);
    } catch (IndexOutOfBoundsException e) {
      // non dovrebbe mai accadere 
      // se non quando c'e' un IOException
    } catch (NullPointerException e) {}
    return ' ';
  }
  public static String unoString() {
    try {
      return br.readLine();
    } catch (IOException e) {
      System.err.println("Errore durante la "+
                         "lettura dell'input!");
      return null;
    }
  }
  private static String input() { // Restrituisce un oggetto di tipo stringa
    try { // Prova ad eseguire questo blocca di codice
      s = br.readLine().trim()+" "; 
      /* 
       * br.readLine(), serve per prendere tutta la riga. Trim() rimuove tutti gli spazi che sono stati inseriti inutilmente.
       * Noi usimo trim() perché alla fine si va a capo con \n. Trim() toglie gli spazi bianchi alla fine dell'input.
      */
      s = s.substring(0,s.indexOf(" "));
      if (s.length() < 1) { // Questo è un controllo dell'input (ho inserito una stringa o ho solo cliccato invio?).
        System.err.println("Errore: inserire almeno un "+
                           "carattere o uno spazio");
        s = null;
      }
      /*
       * Prova e acchiappa un eccezzione, se riesci ad acchiappare questa eccezione scrivi il blocco di codice sottostante. Altrimenti non fare niente.
       */
    } catch (IOException e) {  
      System.err.println("Errore durante la "+
                         "lettura dell'input!");
      return null;
    }
    return s;
  }
}