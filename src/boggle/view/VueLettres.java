package src.boggle.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import src.boggle.Ecouteurs.EcouteurLettre;
import src.boggle.model.Boggle;
import src.boggle.model.Observateur;

public class VueLettres extends GridPane implements Observateur {

    private Button[][] buttons;
    private Boggle boggle;

    public VueLettres(Boggle boggle){

        this.boggle = boggle;
        this.boggle.ajouterObservteur(this);

        int taille = boggle.getTaille() ;
        buttons = new Button[taille][taille] ;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                buttons[i][j] = new Button( String.valueOf( boggle.getLettre(i, j) ) ) ;
                buttons[i][j].setMinSize(90, 90);
                buttons[i][j].setMaxSize(90, 90);
                buttons[i][j].setStyle("-fx-font: 22 Impact ; -fx-background-color: #BEC2BE ; -fx-border-radius: 6  ; -fx-text-fill: #606668 ; -fx-border-width: 0");
                buttons[i][j].setOnAction( new EcouteurLettre(boggle, i, j));
                this.add(buttons[i][j], j, i) ;

            }

        }
        this.setAlignment(Pos.CENTER);
        this.setHgap(6);
        this.setVgap(6);


    }


    @Override
    public void reagir() {

    }
}
