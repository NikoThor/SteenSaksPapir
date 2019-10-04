import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Steen, Saks, Papir 1.0");
        Scanner rundescanner = new Scanner(System.in);
        System.out.println("Hvor mange runder vil du spille?");
        int runder = rundescanner.nextInt();

        for (int i = runder; i >= 1; i--) {


        /* ikke nødvendig, kun for memo
        Haand nikolaj = Haand.STEN;
        Haand rasmus = Haand.SAKS;
        Haand jacob = Haand.PAPIR;
        */
            // her starter spillet/

            SSP runde1 = new SSP();
            // Computer genere en hånd
            SSP.startSpillet(runde1);
            //TODO uråb en vinder af kampen

            /* System.out.println("Spillerens points!" + spillerResultat + "Computerens points!" + computerResultat);

            if(spillerResultat>computerResultat){
                System.out.println("Spilleren vinder! " );
            }
            if (spillerResultat<computerResultat){
                System.out.println("Computeren vinder");
            }*/


        }
    }

}
