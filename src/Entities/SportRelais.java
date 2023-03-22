package Entities;

public class SportRelais extends Sport{


    private int distanceDuTerrain;

    public SportRelais(String unNom,int uneDistance, int unNombre) {
        super(unNom, unNombre);
        distanceDuTerrain=uneDistance;

    }

    public int getDistanceDuTerrain() {
        return distanceDuTerrain;
    }
}
