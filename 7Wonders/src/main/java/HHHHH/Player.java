package HHHHH;
import java.util.ArrayList;
public class Player {

    private ArrayList<Integer> Count; //Pour le compteur, position0 = nbr brique, position1 = nbr pierre, position2 = nbr feuille, position3 = nbr bois, position4 =  nbrverre, position5 = nbrgold
    private ArrayList<ArrayList<TypeCard>> MainJoueur;
    private int point;



    public Player(ArrayList<ArrayList<TypeCard>> MainJoueur, ArrayList<Integer> Count, int point) {
        this.MainJoueur = MainJoueur;
        this.Count = Count;
        this.point = point;
    }
    public ArrayList<ArrayList<TypeCard>> getMainJoueur() {

        return MainJoueur;
    }
    public void setMainJoueur(ArrayList<ArrayList<TypeCard>> MainJoueur) {
        this.MainJoueur = MainJoueur;
    }
    public ArrayList<Integer> getCount() {

        return Count ;
    }
    public void setCount(ArrayList<Integer> Count) {
        this.Count = Count;
    }
    public int getPoint() {

        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
}
