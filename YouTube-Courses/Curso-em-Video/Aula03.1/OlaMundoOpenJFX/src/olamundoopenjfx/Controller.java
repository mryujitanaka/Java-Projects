package olamundoopenjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.Event;

public class Controller {

    @FXML
    public Label lblMensagem;

    public void clicouBotao(Event e){
        lblMensagem.setText("Ola, Mundo!");
    }
}