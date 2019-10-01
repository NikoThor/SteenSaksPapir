import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Steen, Saks, Papir 1.0");
//For flererunder() skal spilleren kunne vælge hvor mange runder der skal slås
        //Spilleren og computeren vælger et træk af gangen og en vinder runden findes
        //derefter nulsættes deres træk
        //til sidst findes en vinder ved den der har vundet flest runder
        System.out.println("Hvor mange runder vil du spille ? ");
        Scanner rundescanner = new Scanner(System.in);
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
            Haand computerensHaand = null;
            int haandInt = (int) (Math.random() * 3 + 1);

            if (haandInt == 1) {
                computerensHaand = Haand.STEN;
            }
            if (haandInt == 2) {
                computerensHaand = Haand.SAKS;
            }
            if (haandInt == 3) {
                computerensHaand = Haand.PAPIR;
            }
            // indlæser spillerens hånd

            System.out.println("vælg mellem sten, saks og papir ");
            Scanner scanner = new Scanner(System.in);
            Haand spillerensHaand = null;
            String spillerenString = scanner.next().toLowerCase();
            if (spillerenString.equals("sten")) {
                spillerensHaand = Haand.STEN;
            }
            if (spillerenString.equals("saks")) {
                spillerensHaand = Haand.SAKS;
            }
            if (spillerenString.equals("papir")) {
                spillerensHaand = Haand.PAPIR;
            }
            // sammenligne dem med slaa()

            int resultat = runde1.slaa(computerensHaand, spillerensHaand);
            int spillerResultat = 0;
            int computerResultat = 0;
            //udråb en vinder af 1 runde
            System.out.println("Computeren valgte " + computerensHaand + " og spilleren valgte " + spillerensHaand);

            if (resultat == 1) {
                System.out.println(" Computeren vinder");
                computerResultat = +1;
            }
            if (resultat == 0) {
                System.out.println("uafgjort");
            }
            if (resultat == 2) {
                System.out.println("Spilleren vinder");
                spillerResultat = +1;
            }
            if (resultat == -1) {
                System.out.println("fejl ");
            }
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
