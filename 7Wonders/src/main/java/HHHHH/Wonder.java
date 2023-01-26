package HHHHH;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wonder {

    private String nom;

    private  ArrayList<ArrayList<Integer>>  etape ;

    public Wonder(String nom, ArrayList<ArrayList<Integer>> Etape) {
        this.etape = etape;
        this.nom = nom;
    }
    public ArrayList<ArrayList<Integer>> getEtape() {
        return etape;
    }
    private void setEtape(ArrayList<ArrayList<Integer>> etape) {
        this.etape = etape;
    }
    public String getNom() {
        return nom;
    }
    private void setNom(String nom) {
        this.nom = nom;
    }
}
