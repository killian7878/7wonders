package HHHHH;

import java.util.ArrayList;
import java.util.Scanner;

public class GAME {



    private final ArrayList<TypeCard> typecard = new ArrayList<>();
    private int fightRemaining = 5;                                         //nombre de tours maximum

    public static ArrayList<TypeCard> basicList(){
        ArrayList<TypeCard> card = new ArrayList<>();
        for (TypeCard i : TypeCard) {
            card.add(i);
            }
            return card;
        }

     public static void main (String[]args){

    System.out.println("Yoyoyo");

    blueCard Carte1= new blueCard("blue",4);
    redCard Carte2 = new redCard("red",2);
    greyCard Carte3 = new greyCard("grey", "iron");
    greenCard Carte4 = new greenCard("green", "Compass");
    //System.out.println(basicList());

    }

}
