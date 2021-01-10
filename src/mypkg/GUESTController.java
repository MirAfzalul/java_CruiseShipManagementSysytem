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
public class GUESTController implements Initializable {

    @FXML
    private Button checkPackageButton;
    @FXML
    private Button cancelpackageButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkPackageButtonOnClick(ActionEvent event) {
        try {
            Parent checkPackage = FXMLLoader.load(getClass().getResource("CHECK PACKAGE.fxml"));
            Scene package1 = new Scene(checkPackage);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(package1);
             
            window.setTitle("PACKAGE Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(GUESTController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void cancelpackageButtonOnClick(ActionEvent event) {
                try {
            Parent cancelPackageParent = FXMLLoader.load(getClass().getResource("CANCEL package.fxml"));
            Scene cancelPackage = new Scene(cancelPackageParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(cancelPackage);
            window.setTitle("Cancel Package Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CANCELPackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
