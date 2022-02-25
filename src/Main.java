package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import src.boggle.model.Boggle;
import src.boggle.view.VueInfos;
import src.boggle.view.VueLettres;

public class Main extends Application {

    @Override
    public void start (Stage primaryStage) {
        Boggle bog = new Boggle(4) ;
        BorderPane root = new BorderPane() ;
        root.setBottom(new VueInfos(bog)) ;
        root.setCenter(new VueLettres(bog)) ;
        //root.setRight(new PanneauControle(bog)) ;
        root.setStyle("-fx-background-color: #606668");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.setTitle("Le fabuleux Jeu du Boggle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
