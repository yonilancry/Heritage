package Entities;

public class Club{
    protected int idClub;
    protected String nomClub;
    protected int nbPoints;

    public int getIdClub() {
        return idClub;
    }

    public String getNomClub() {
        return nomClub;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public Club(int unId, String unNom, int unNbPoints){
        this.idClub=unId;
        nomClub=unNom;
        nbPoints=unNbPoints;


    }
    

}
