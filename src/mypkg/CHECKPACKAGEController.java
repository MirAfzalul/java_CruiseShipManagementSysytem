/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class CHECKPACKAGEController implements Initializable {

    @FXML
    private Button deluxButton;
    @FXML
    private Button economyButton;
    @FXML
    private Button customizeButton;
    @FXML
    private Button goBackButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void deluxButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void standardButtonOnClick(ActionEvent event) {
        try {
            Parent standardParent = FXMLLoader.load(getClass().getResource("STANDARD package.fxml"));
            Scene standard = new Scene(standardParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(standard);
            window.setTitle("Standard Package Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CHECKPACKAGEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void economyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void customizeButtonOnClick(ActionEvent event) {
        try {
            Parent customizeParent = FXMLLoader.load(getClass().getResource("CUSTOMIZE package.fxml"));
            Scene customize = new Scene(customizeParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(customize);
            window.setTitle("customize Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CHECKPACKAGEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }
    
}
