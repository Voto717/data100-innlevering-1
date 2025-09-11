import java.util.Scanner;

public class TrinnskattO11 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN_INNTEKT = 217_400;    // Vi bruker 'underscore ' for lesbarhet
        
        System.out.print("Fyll inn bruttoinntekten din:  ");
        int inntekt = scanner.nextInt();
        double trinnskatt = 0.0;
        
        if (inntekt <= MIN_INNTEKT) {
            System.out.println("Det betales ingen trinnskatt på inntekt under " + MIN_INNTEKT);
        } else { 
            if (inntekt > 942_400) {
                trinnskatt += (inntekt - 942_400) * 0.167;
                inntekt = 942_400; // For beregning av neste lavere bruttoinntektstrinn
            }
            if (inntekt > 697_150) {
                trinnskatt += (inntekt - 697_150) * 0.137;
                inntekt = 697_150;
            }
            if (inntekt > 306_050) {
                trinnskatt += (inntekt - 306_050) * 0.04;
                inntekt = 306_050;
            }
            if (inntekt > 217_400) {
                trinnskatt += (inntekt - 217_400) * 0.017;
            }
            System.out.printf("Den beregnede trinnskatten er:  %.2f kr%n",  trinnskatt);
        }
        scanner.close();
    }
}
