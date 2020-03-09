package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int alter = 17;

        //hier wird der Code immer ausgeführt

        if (alter >= 18){
            // hier passiert nur was wenn über 18
            System.out.println("Yaaaayy ich darf rein!");
        } else if (alter >=16) {
            System.out.println("Darf rein aber Schnaps nicht erlaubt");
        } else {
            //hier passiert nur was wenn < 18
            System.out.println("Gehe inzwischen Pizza essen");
        }

        //hier wird der Code auch immer ausgeführt

        System.out.println("Warte gelangweilt im Auto");


        //Bsp switch

        int note = 2, stipendium;

        //Berechne Förderstipendium
        switch (note) {
            case 1:
                //code für wenn 1 ausgeführt wird
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium =30;
                break;
            default:
                stipendium = 10;
                break; }

        System.out.println("Stipendium = " + stipendium + "€");

    }
}
