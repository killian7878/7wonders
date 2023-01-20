package HHHHH;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

// blup

public class GAME {

    private Random rand = new Random();
    private final ArrayList<TypeCard> typecard = new ArrayList<>();
    private int fightRemaining = 5;            //nombre de tours maximum


    /*public static ArrayList<TypeCard> basicList(){
        ArrayList<TypeCard> card = new ArrayList<>();
        for (TypeCard i :  {
            card.add(i);
            }
            return card;
        }*/

    public static ArrayList<TypeCard> Piledepart() {
        ArrayList<TypeCard> PileDepart = new ArrayList<TypeCard>();

        for (int i = 0; i < 6; i++) {
            greyCard carte = new greyCard("gris", "brique");
            PileDepart.add(carte);
        }
        for (int i = 0; i < 6; i++) {
            greenCard carte = new greenCard("vert", "compas");
            PileDepart.add(carte);
        }
        for (int i = 0; i < 6; i++) {
            redCard carte = new redCard("rouge", 2);
            PileDepart.add(carte);
        }
        for (int i = 0; i < 6; i++) {
            blueCard carte = new blueCard("bleu", 2);
            PileDepart.add(carte);
        }
        return PileDepart;
    }


    ////Codage de piochage Maximilien
    // Déclaration d'une fonction qui prend en paramètre une pile de départ et un joueur
    public static void piocherCarte(ArrayList<TypeCard> PileDepart, ArrayList<TypeCard> MainJoueur) {

        // Vérification de la taille de la pile de départ
        if (PileDepart.size() > 0) {

            // Utilisation de la classe Random pour générer un index aléatoire qui correspond à une carte dans la pile de départ
            Random rand = new Random();
            int index = rand.nextInt(PileDepart.size());

            // Récupération de la carte à l'index généré
            TypeCard cartePiochee = PileDepart.get(index);

            // Ajout de la carte dans la main du joueur
            MainJoueur.add(cartePiochee);

            // Retrait de la carte de la pile de départ
            PileDepart.remove(index);
        }
        System.out.println("Vous avez pioché une carte");

    }
    
    public static void main(String[]args){

        System.out.println("Yoyoyo");

        blueCard Carte1= new blueCard("blue",4);
        redCard Carte2 = new redCard("red",2);
        greyCard Carte3 = new greyCard("grey", "iron");
        greenCard Carte4 = new greenCard("green", "Compass");
        //System.out.println(basicList());
        ArrayList<TypeCard> yoyoyo = new ArrayList<TypeCard>();
        yoyoyo=Piledepart();
        System.out.println("lololo");
    }

}
