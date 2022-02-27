package src.boggle.Ecouteurs;

import javafx.application.Platform;
import javafx.event.EventHandler;
import src.boggle.model.Boggle;
import javafx.event.ActionEvent;

public class EcouteurQuitter implements EventHandler<ActionEvent> {

    private Boggle boggle ;

    public  EcouteurQuitter(Boggle boggle){
        this.boggle = boggle ;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Platform.exit();
    }
}
