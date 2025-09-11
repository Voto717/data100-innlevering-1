import java.util.Scanner;

public class b_KarakterskalaO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 10 students
        for (int studentNr = 1; studentNr <= 10; studentNr++) {
            System.out.print("Skriv inn poengsum for student " + studentNr + ":  ");
            int poeng = scanner.nextInt();
            char karakter; // Declare the variable karakter

            // Grade logic
            if (poeng < 0 || poeng > 100) {
                System.out.println("Feil: Ugyldig poengsum.");
            } else {
                // Grade calculation logic
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
                System.out.println("Karakter:  " + karakter);
            }
        }
        scanner.close();
    }
}
