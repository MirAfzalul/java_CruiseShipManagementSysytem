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
import java.util.Optional;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class PROTOCOLController implements Initializable {

    @FXML
    private TextField lifeJacketsField;
    @FXML
    private TextField emergencyBoatField;
    @FXML
    private TextField passengerOnBoardField;
    @FXML
    private ComboBox comboBox;
    @FXML
    private TextArea addCommentArea;
    @FXML
    private Button homeButton;
    @FXML
    private Button resetButton;
    @FXML
    private Button submitButton;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //comboBox.getItems().add("China");
        comboBox.getItems().addAll("China","Malaysia","Japan","Singapore");
        comboBox.setValue("China");  
    }    

    @FXML
    private void comboBoxOnClick(ActionEvent event) {
    }

    @FXML
    private void homeButtonOnClick(ActionEvent event) {
        try {
            Parent officerParent = FXMLLoader.load(getClass().getResource("Officer.fxml"));
            Scene officer = new Scene(officerParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(officer);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(PROTOCOLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void resetButtonOnClick(ActionEvent event) {
        lifeJacketsField.setText(null);
        emergencyBoatField.setText(null);
        passengerOnBoardField.setText(null);
        addCommentArea.setText(null);
        comboBox.setValue("China");
        statusLabel.setText("Reset...");
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Alert...");
        String s = "Do You Want To Submit Data?";
        alert.setContentText(s);

        Optional<ButtonType> result = alert.showAndWait();

        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            File f=new File("protocol.txt");
        String str="";
        try {
            if(f.exists())
            {
   
                FileWriter fw=new FileWriter(f,true);
                str=passengerOnBoardField.getText()+" "+lifeJacketsField.getText()+" "+emergencyBoatField.getText()+" "+comboBox.getValue()+" "+addCommentArea.getText()+" ";
                fw.write(str);
                fw.close();
            }
            else{
                FileWriter fw=new FileWriter(f);
            str=passengerOnBoardField.getText()+" "+lifeJacketsField.getText()+" "+" "+emergencyBoatField.getText()+" "+comboBox.getValue()+" "+addCommentArea.getText()+" ";
                fw.write(str);
                fw.close();
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(PROTOCOLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        int l=Integer.parseInt(lifeJacketsField.getText());
        int p=Integer.parseInt(passengerOnBoardField.getText());
        
        if(p<l)
        {
            
            statusLabel.setText("You Have Extra "+(l-p)+"Life Jackets");
        }
        else if(p>l)
        {
            statusLabel.setText("WARNING!!!!You Have "+(p-l)+"Life Jackets Less");
        }
        else 
        {
            statusLabel.setText("equal amount of passenger and life jacket");
        }
       // statusLabel.setText("Data Saved...");
        }
    }
    
}
