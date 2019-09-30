import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Steen, Saks, Papir 1.0");

        // ikke nødvendig, kun for memo
        Haand nikolaj = Haand.STEN;
        Haand rasmus = Haand.SAKS;
        Haand jacob = Haand.PAPIR;

        // her starter spillet
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(nikolaj, rasmus));

        // Computer genere en hånd
        Haand computerensHaand = null;
        int haandInt = (int) (Math.random()*3+1);
        //computerensHaand = Haand.values()[haandInt]; // korte nørklet kode
        if (haandInt == 1) {computerensHaand = Haand.STEN;}
        if (haandInt == 2) {computerensHaand = Haand.SAKS;}
        if (haandInt == 3) {computerensHaand = Haand.PAPIR;}
        // indlæser spillerens hånd'
        System.out.println("vælg mellem sten, saks og papir ");
        Scanner scanner = new Scanner(System.in);
        Haand spillerensHaand = null;
        String spillerenString = scanner.next();
        if (spillerenString.equals("sten")) { spillerensHaand = Haand.STEN;}
        if (spillerenString.equals("saks")) { spillerensHaand = Haand.SAKS;}
        if (spillerenString.equals("papir")) { spillerensHaand = Haand.PAPIR;}
        // sammenligne dem med slaa()
        int resultat = runde1.slaa(computerensHaand, spillerensHaand);

        //udråb en vinder
        System.out.println("Computeren valgte " + computerensHaand);
        System.out.println("Spilleren valgte " + spillerenString);
        if (resultat == 1) {
            System.out.println("Computeren vinder"); }
        if (resultat == 0) {
            System.out.println("uafgjort");}
        if (resultat == 2) {
            System.out.println("Spilleren vinder");
        }
        if (resultat == -1) {
            System.out.println("fejl ");
        }
        // Todo vis resultatet er meningsfuld
    }
}
