import java.util.Scanner;

public class BeregnefakultetO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et positivt heltall (n): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Feil: n må være positiv.");
        } else {
            long fakultet = 1; // Bruk 'long' for å unngå overløp for større n

            // Multipliser tall fra 1 opp til n
            for (int i = 1; i <= n; i++) {
                fakultet = fakultet * i;
            }

            System.out.println(n + "! = " + fakultet);
        }
        scanner.close();
    }
}