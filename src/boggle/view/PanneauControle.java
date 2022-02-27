package src.boggle.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import src.boggle.Ecouteurs.EcouteurEffacer;
import src.boggle.Ecouteurs.EcouteurQuitter;
import src.boggle.Ecouteurs.EcouteurValider;
import src.boggle.model.Boggle;
import src.boggle.model.Observateur;

public class PanneauControle extends VBox implements Observateur {

    private Button button1 ;
    private Button button2 ;
    private Button button3 ;
    private Boggle boggle ;

    public PanneauControle( Boggle bog){

        this.boggle = bog;
        this.boggle.ajouterObservteur(this);

        button1 = new Button("Valider");
        button1.setStyle("-fx-font: 22 Impact ; -fx-text-fill: #C91003 ; -fx-background-color: #BEC2BE ");
        button1.setMinSize(100, 50);
        button1.setMaxSize(100, 50);
        button1.setOnAction(new EcouteurValider());



        button2 = new Button("Effacer");
        button2.setStyle("-fx-font: 22 Impact ; -fx-text-fill: #C91003; -fx-background-color: #BEC2BE ");
        button2.setMaxSize(100, 50);
        button2.setMinSize(100, 50);
        button2.setOnAction(new EcouteurEffacer());


        button3 = new Button("Quitter");
        button3.setStyle("-fx-font: 22 Impact ; -fx-text-fill: #C91003; -fx-background-color: #BEC2BE ;  ");
        button3.setMaxSize(100, 50);
        button3.setMinSize(100, 50);
        button3.setOnAction(new EcouteurQuitter(boggle));





        this.getChildren().addAll(button1, button2, button3);
        this.setAlignment(Pos.CENTER_RIGHT);
        this.setPadding(new Insets(15));
        this.setSpacing(5);


    }


    @Override
    public void reagir() {

    }
}
