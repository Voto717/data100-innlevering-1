import java.util.Scanner;

public class c_KarakterskalaO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int studentNr = 1; studentNr <= 10; studentNr++) {

            int poeng;

          
            do {
                System.out.print("Skriv inn poengsum for student " + studentNr + " (0-100): ");
                poeng = scanner.nextInt();

                //feilkontroll
                if (poeng < 0 || poeng > 100) {
                    System.out.println("Ugyldig poengsum! Prøv på nytt.");
                }
            } while (poeng < 0 || poeng > 100); // Betingelse for å gjenta løkken: hvis input er UGYLDIG

           
            char karakter;
            if (poeng >= 90) karakter = 'A';
            else if (poeng >= 80) karakter = 'B';
            else if (poeng >= 60) karakter = 'C';
            else if (poeng >= 50) karakter = 'D';
            else if (poeng >= 40) karakter = 'E';
            else karakter = 'F';

            System.out.println("Karakter for student " + studentNr + ": " + karakter);

        }
        scanner.close();
    }
}