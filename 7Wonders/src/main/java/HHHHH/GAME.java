package HHHHH;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GAME {

// Tableau Main du Joueur et Merveilles
    public static void TableauMainMerveille(int nbPlayer) {
        ArrayList<ArrayList<Object>> tableau = new ArrayList<>();
        for (int i = 0; i < nbPlayer; i++) {
            ArrayList<Object> sub_tab = new ArrayList<>();
            ArrayList<ArrayList<TypeCard>> HandPlayer = new ArrayList<ArrayList<TypeCard>>(); //Main du joueur
            ArrayList<Integer> Count = new ArrayList<Integer>();
            int point = 0;
            Player player = new Player(HandPlayer, Count, point);
            sub_tab.add(player);
            ArrayList<ArrayList<Integer>> etape = new ArrayList<ArrayList<Integer>>();
            Wonder wonder = new Wonder("Colosse de Rhodes", etape);

            sub_tab.add(wonder);
            tableau.add(sub_tab);
        }
    }

    public static void EtapeWonder(ArrayList<ArrayList<Integer>> Etape) {
        ArrayList<Integer> etape1 = new ArrayList<Integer>();
        etape1.add(2); //nb de points
        etape1.add(2); //nb de cartes
        etape1.add(1); //égalite ou non 0 diff 1 pareil
        Etape.add(etape1);

        ArrayList<Integer> etape2 = new ArrayList<Integer>();
        etape1.add(2); //nb de points
        etape1.add(3); //nb de cartes
        etape1.add(0); //égalite ou non 0 diff 1 pareil
        Etape.add(etape2);

        ArrayList<Integer> etape3 = new ArrayList<Integer>();
        etape1.add(4); //nb de points
        etape1.add(4); //nb de cartes
        etape1.add(0); //égalite ou non 0 diff 1 pareil
        Etape.add(etape3);

        ArrayList<Integer> etape4 = new ArrayList<Integer>();
        etape1.add(3); //nb de points
        etape1.add(3); //nb de cartes
        etape1.add(1); //égalite ou non 0 diff 1 pareil
        Etape.add(etape4);
    }

    public static ArrayList<TypeCard> Piledepart() {
        ArrayList<TypeCard> PileDepart = new ArrayList<TypeCard>();

        for (int i = 0; i < 6; i++) {
            greyCard carte1 = new greyCard("gris", "brique");
            PileDepart.add(carte1);
            greyCard carte2 = new greyCard("gris", "bois");
            PileDepart.add(carte2);
            greyCard carte3 = new greyCard("gris", "pierre");
            PileDepart.add(carte3);
            greyCard carte4 = new greyCard("gris", "feuille");
            PileDepart.add(carte4);
            greyCard carte5 = new greyCard("gris", "verre");
            PileDepart.add(carte5);
            greyCard carte6 = new greyCard("or", "or");
            PileDepart.add(carte6);

        }
        for (int i = 0; i < 6; i++) {
            greenCard carte1 = new greenCard("vert", "compas");
            PileDepart.add(carte1);
            greenCard carte2 = new greenCard("vert", "rouage");
            PileDepart.add(carte2);
            greenCard carte3 = new greenCard("vert", "argile");
            PileDepart.add(carte3);
        }
        for (int i = 0; i < 6; i++) {
            redCard carte1 = new redCard("rouge", 1);
            PileDepart.add(carte1);
            redCard carte2 = new redCard("rouge", 2);
            PileDepart.add(carte2);
            redCard carte3 = new redCard("rouge", 3);
            PileDepart.add(carte3);
        }
        for (int i = 0; i < 6; i++) {
            blueCard carte1 = new blueCard("bleu", 2);
            PileDepart.add(carte1);
            blueCard carte2 = new blueCard("bleu", 3);
            PileDepart.add(carte2);
        }
        return PileDepart;
    }

    public static ArrayList<TypeCard> pileMelange(ArrayList<TypeCard> PileDepart) {
        ArrayList<TypeCard> PileMelange = new ArrayList<TypeCard>();
        while (PileDepart.size() > 0) {
            Random rand = new Random();// Utilisation de la classe Random pour générer un index aléatoire qui correspond à une carte dans la pile de dépaet
            int index = rand.nextInt(PileDepart.size());
            TypeCard cartePiochee = PileDepart.get(index);
            PileMelange.add(cartePiochee);
            // Retrait de la carte de la pile de départ
            PileDepart.remove(index);
        }
        return PileMelange;
    }

    ////Piochage
    // Déclaration d'une fonction qui prend en paramètre une pile de départ et un joueur
    public static void piocherCarte(ArrayList<TypeCard> PileDepart, ArrayList<TypeCard> MainJoueur) {

        // Vérification de la taille de la pile de départ
        if (PileDepart.size() > 0) {

            // Utilisation de la classe Random pour générer un index aléatoire qui correspond à une carte dans la pile de dépaet

            // Récupération de la carte à l'index généré
            TypeCard cartePiochee = PileDepart.get(0);

            // Ajout de la carte dans la main du joueur
            MainJoueur.add(cartePiochee);

            // Retrait de la carte de la pile de départ
            PileDepart.remove(0);
        }
        System.out.println("Vous avez pioché une carte");

    }


    public static void nombreMaterialInHand(ArrayList<Integer> count, greyCard newCard) {
        if (newCard.getRessource() == "brique") {
            count.set(0,count.get(0)+1);

        } else if (newCard.getRessource() == "pierre") {
            count.set(1,count.get(1)+1);
        } else if (newCard.getRessource() == "feuille") {
            count.set(2,count.get(2)+1);
        } else if (newCard.getRessource() == "bois") {
            count.set(3,count.get(3)+1);
        }else if (newCard.getRessource() == "verre") {
            count.set(4,count.get(4)+1);
        }
        else if (newCard.getRessource() == "gold") {
            count.set(5,count.get(5)+1);
        }
    }

    public void  wonderRealisation (Wonder wonder,ArrayList<Integer> count,Player player){
    if (wonder.getEtape(0).get(2)==0){
        for (int i=0; i<count.size();i++){

        }
    }
    }

    public static void main(String[] args) {

        System.out.println("Yoyoyo");
        ArrayList<TypeCard> y = new ArrayList<TypeCard>();
        ArrayList<TypeCard> main = new ArrayList<TypeCard>();


        /*ArrayList<TypeCard> yoyoyo = new ArrayList<TypeCard>();
        yoyoyo = Piledepart();
        ArrayList<TypeCard> NewPile = new ArrayList<TypeCard>();
        NewPile = pileMelange(yoyoyo);*/

    }
}


