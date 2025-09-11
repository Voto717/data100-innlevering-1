import java.util.Scanner;

public class KarakterskalaO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv inn studentens poengsum (0–100): ");
        int poeng = scanner.nextInt();

        if (poeng < 0 || poeng > 100) {      //Feilkontroll
            System.out.println("Feil: Ugyldig poengsum. Må være mellom 0 og 100.");
        } else {
            char karakter;
            if (poeng >= 90) {
                karakter = 'A';
            } else if (poeng >= 80) {
                karakter = 'B';
            } else if (poeng >= 60) {
                karakter = 'C';
            } else if (poeng >= 50) {
                karakter = 'D';
            } else if (poeng >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }
            System.out.println("Karakteren er: " + karakter);
        }
        scanner.close();
    }
}