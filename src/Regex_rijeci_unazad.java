//Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i
// okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Dobar


import java.util.Scanner;
public class Regex_rijeci_unazad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite neki tekst");

        String unos = sc.nextLine().trim();

       String[] characters = unos.split("\\s+");

             for (int i = characters.length - 1; i >= 0; i--) {
             System.out.print(characters[i] + " ");

            }

         }
}





