package src.boggle.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import src.boggle.model.Boggle;
import src.boggle.model.Observateur;


public class VueInfos extends TilePane implements Observateur {

    private Label label1 ;
    private Label label2 ;
    private Boggle boggle;

    public VueInfos(Boggle bog) {
        this.boggle = bog;
        this.boggle.ajouterObservteur(this);


        label1 = new Label("Votre mot :");
        label1.setStyle("-fx-font: 22 Impact ; -fx-text-fill: #BEC2BE");
        label1.setMinSize(300, 150);
        label1.setMaxSize(1000, 150);



        label2 = new Label("Votre score :");
        label2.setStyle("-fx-font: 22 Impact ; -fx-text-fill: #BEC2BE");
        label2.setMaxSize(250, 150);
        label2.setMinSize(250, 150);
        this.getChildren().addAll(label2, label1);
        this.setAlignment(Pos.BOTTOM_CENTER);

    }

    @Override
    public void reagir() {
        label2.setText(new StringBuilder("Votre mot :" + boggle.getMot()).toString());
    }

}
