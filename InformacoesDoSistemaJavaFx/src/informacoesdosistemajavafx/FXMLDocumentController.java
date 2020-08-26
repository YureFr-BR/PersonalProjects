/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacoesdosistemajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author yure5
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem1;
    private Label lblUserName;
    private Label lblMensagem2;
    private Label lblDataHora;
    private Button btnClick;
    
    
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblUserName.setText("Projeto ainda em construção!");
      //  lblDataHora.setText("Projeto ainda em construção!");
        // Verificar exceção no click do botão
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void msgbox(String you_clicked_me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
