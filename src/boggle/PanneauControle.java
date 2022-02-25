package src.boggle;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import src.boggle.model.Boggle;
import src.boggle.model.Observateur;

public class PanneauControle extends VBox implements Observateur {

    private Button button1 ;
    private Button button2 ;
    private Button button3 ;

    public PanneauControle( Boggle boggle){

    }


    @Override
    public void reagir() {

    }
}
