package Vues;

import Entities.Club;
import Entities.Sport;
import Entities.SportBallon;
import Entities.SportRelais;

import javax.swing.*;
import java.util.ArrayList;

public class FrmMenu extends JFrame {

    private JPanel pnlRoot;

    public FrmMenu(){
        this.setTitle("TP-Heritage");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        //Je crée mes clubs
        Club c1 = new Club(1,"Dijon",63);
        Club c2 = new Club(2,"PSG",67);
        Club c3 = new Club(3, "Nantes",65);


        SportBallon sb = new SportBallon("Basketball",5,35,45);

        Sport s1= new Sport("Javelot",1);
        Sport s2 = new Sport("Judo",1);
        SportBallon sb1= new SportBallon("Football",11,68,105);
        SportBallon sb2= new SportBallon("Handball",7,35,65);
        SportRelais sr1= new SportRelais("4*100",400,4);
        ArrayList<Sport> mesSports=new ArrayList<>();
        ArrayList<Club> mesClubs= new ArrayList<>();
        mesSports.add()


    }
}
