package Entities;

public class Sport implements ISport, ISportCollectif{

    protected String nomSport;
    protected int nbJoueurs;

    public Sport(String unNom,int unNombre ){
        this.nomSport=unNom;
        this.nbJoueurs=unNombre;


    }

    public String getNomSport() {
        return nomSport;
    }



    public int GetNbJoueurs() {
        return nbJoueurs;
    }
    @Override
    public String getDescription() {
        return "Sport= "+nomSport+"Nombre de joueurs = "+nbJoueurs;
    }


}
