public class SSP {

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
