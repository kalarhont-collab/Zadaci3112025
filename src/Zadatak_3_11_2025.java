import java.util.Scanner;

public class Zadatak_3_11_2025 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Unesite slova, brojeve i ostale znakova za provjeru");

    String unos = sc.nextLine();

    int slova = 0;
    int brojevi = 0;
    int ostaliZnakovi = 0;

    for (int i = 0; i < unos.length(); i++) {

        char pretraživanje = unos.charAt(i);

        if (pretraživanje >= 'a' && pretraživanje <= 'z')  {
            slova++;

        } else if (pretraživanje >= 'A' && pretraživanje <= 'Z') {
            slova++;


        } else if (pretraživanje >= '0' && pretraživanje <= '9') {
            brojevi++;

        } else {
            ostaliZnakovi++;
        }

    }
        System.out.println("Slova: " + slova);
        System.out.println("Brojevi: " + brojevi);
        System.out.println("Ostali znakovi: " + ostaliZnakovi);
}
}


