package Entities;

public class SportBallon extends Sport{

    private int largeurDuTerrain;
    private int longueurDuTerrain;

    public SportBallon(String unNom, int unNombre,int uneLargeur, int uneLongueur) {
        super(unNom, unNombre);
        largeurDuTerrain=uneLargeur;
        longueurDuTerrain=uneLongueur;

}

    public int getLargeurDuTerrain() {
        return largeurDuTerrain;
    }

    public int getLongueurDuTerrain() {
        return longueurDuTerrain;
    }
}
