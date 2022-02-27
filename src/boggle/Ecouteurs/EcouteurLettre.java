package src.boggle.Ecouteurs;

import javafx.event.ActionEvent;
import src.boggle.model.Boggle;
import javafx.event.EventHandler ;


public class EcouteurLettre implements EventHandler<ActionEvent>{

    private Boggle boggle ;
    private int lig ;
    private int col ;

    public EcouteurLettre(Boggle bog, int ligne, int colone){
        this.boggle = bog ;

        this.col = colone ;
        this.lig = ligne ;


    }

    @Override
    public void handle(ActionEvent actionEvent) {
        boggle.ajouterLettre(lig, col);
    }
}
