/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class PAYMENTDetailsController implements Initializable {

    @FXML
    private DatePicker dateField;
    @FXML
    private TextField namField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField cardNumberField;
    @FXML
    private TextField addressfield;
    @FXML
    private PasswordField pinField;
    @FXML
    private Button confirmButton;
    @FXML
    private CheckBox agreeCheckBox;
    @FXML
    private Button goBackButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void confirmButtonOnClick(ActionEvent event) {
        if(agreeCheckBox.isSelected())
        {
            String str = "";
        try {
            File f = null;
            FileWriter fw = null;
            
            f = new File("Payment.txt");
            if(f.exists())fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
            
            str = (namField.getText()+","+emailField.getText()+","+cardNumberField.getText()+","
                    +addressfield.getText()+","+pinField.getText()+","+dateField.getValue());
            
            fw.write(str);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PAYMENTDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("CONFIRM?");
                            alert.setHeaderText("CONFIRM BOOKING ");
                             String s1 ="DO YOU WANT TO CONFIRM BOOKING?";
                                 alert.setContentText(s1);
                                    alert.show();
        }
        else
        {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Error");
                            alert.setHeaderText("select agreement ");
                             String s1 ="";
                                 alert.setContentText(s1);
                                    alert.show();
        }
        
        
        
    }

    @FXML
    private void agreeCheckBoxOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }
    
}
