package br.com;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label lblMensagem;
    private Button btnClick;

    @FXML
    private void clicouBotao() throws IOException {
        lblMensagem.setText("Ola, mundo");
    }
}
