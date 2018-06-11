/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwopennlp;

import gwopennlp.OpenNlp.Nlp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    TextField txtFrase; 
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        String sentenceIn = txtFrase.getText(); 
        Nlp ClaseProcesamientoTexto = new Nlp(); 
        String sentenceOut = ClaseProcesamientoTexto.validar(sentenceIn); 
        ClaseProcesamientoTexto.leerCsv();
        label.setText(sentenceOut);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
