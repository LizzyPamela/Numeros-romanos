/* Convertir numeros en numeros Romanos:
 * Equivalencias: 
 *  I = 1
 *  V = 5
 *  X = 10
 *  L = 50
 *  C = 100
 *  D = 500 
 *  M = 1000
 */
import java.util.Scanner;

public class Romanos {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\nDigite un numero: ");
    int n = sc.nextInt();
    
    if (n <= 0) {
        System.out.print("La cantidad digitada es incorrecta"); // Los numeros romanos no tienen negativos
    } else { // Convirtiendo de forma ascendente
        while (n >= 1000) { // Convertir 1000s
            System.out.print("M");
            n = n - 1000; }

        if (n >= 900) { // Convertir  900
            System.out.print("CM");
            n = n - 900; }

        if (n >= 500) { //Convertir 500
            System.out.print("D");
            n = n - 500; }

        if (n >= 400) { //Convertir 400
            System.out.print("CD");
            n = n - 400; }

        while (n >= 100) { // Convertir 100s
            System.out.print("C");
            n = n - 100;}

        if (n >= 90) { //Convertir 90
            System.out.print("XC");
            n = n - 90;}

        if (n >= 50) { // Convertir 50
            System.out.print("L");
            n = n - 50;}

        if (n >= 40) { //convertir 40
            System.out.print("XL");
            n = n - 40;}

        while (n >= 10) { //Convertir 10s
            System.out.print("X");
            n = n - 10;}

        if (n >= 9) { // Convertir 9
            System.out.print("IX");
            n = n - 9;}

        if (n >= 5) { // Convertir 5
            System.out.print("V");
            n = n - 5;}

        if (n >= 4) { // Convertir 4
            System.out.print("IV");
            n = n - 4;}

        while (n >= 1) { //Convertir valores entre 1 y 3
            System.out.print("I");
            n = n - 1; }

        System.out.print("\n\n");
    } // fin else de conversion 

    sc.close();
}

        
    }// fin Romanos
    

