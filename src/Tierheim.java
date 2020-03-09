public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim!");
        // Hund Lassie - 20kg und löst Kriminalfälle
        double futterLassie;
        double ge = 20;
        futterLassie = berechneFuttermenge(ge);

        System.out.println("Lassie bekommt " + futterLassie + "kg Futter");

        //unterschiedliche Varianten um das Gewischt um 1kg zu erhöhen
        double x = 0;
        x = ++ge;
        System.out.println(x + "" + ge);
        // ge = ge + 1;
        // ge += 1;
        // ge++; ++ge;

        // füttern am Abend

        futterLassie = berechneFuttermenge(ge);
        System.out.println("Lassie bekommt am Abend " + futterLassie + "kg Futter");
    }

    public static double berechneFuttermenge (double gewicht) {
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;

        // ganz kurz geschrieben:
        //return = gewicht / 20;
        //oder: double futterMenge = gewicht / 20;
    }
}
