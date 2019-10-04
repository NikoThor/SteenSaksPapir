import java.util.Scanner;

public class SSP {

    public static void startSpillet(SSP runde1) {
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
    }

    /** Hvis første hånd vinder return 1
     * Hvis Anden Hånd vinder return 2
     * Hvis uafgjort return 0
     * Hvis fejl return -1**/
   int slaa(Haand a, Haand b){

       int resultat = -1;

       // Første hånd sten
       if(a == Haand.STEN)

           // Første hånd er sten
           if(b == Haand.STEN) {return resultat = 0; }
        if (b == Haand.SAKS)  {return resultat = 1; }
        if (b == Haand.PAPIR) {return resultat =  2; }
        // hvis første hånd er saks
       if(a == Haand.SAKS)
           if(b == Haand.STEN) {return resultat = 2; }
       if (b == Haand.SAKS)  {return resultat = 0; }
       if (b == Haand.PAPIR) {return resultat =  1; }
        // hvis første hånd er papir
       if(a == Haand.PAPIR)
           if(b == Haand.STEN) {return resultat = 1; }
       if (b == Haand.SAKS)  {return resultat = 2; }
       if (b == Haand.PAPIR) {return resultat =  0; }
       return resultat;}
    // TODO rounds


    //For flererunder() skal spilleren kunne vælge hvor mange runder der skal slås
    //Spilleren og computeren vælger et træk af gangen og en vinder runden findes
    //derefter nulsættes deres træk og igen
    //til sidst findes en vinder ved den der har vundet flest runder
}
