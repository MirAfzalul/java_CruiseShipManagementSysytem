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
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class CUSTOMIZEPackageController implements Initializable {

    @FXML
    private CheckBox deluxRoomCheckbox;
    @FXML
    private CheckBox poolCheckbox;
    @FXML
    private CheckBox casinoCheckbox;
    @FXML
    private CheckBox gymSpaCheckbox;
    @FXML
    private RadioButton twoPeopleRB;
    @FXML
    private RadioButton fourPeopleRB;
    @FXML
    private RadioButton sixPeopleRB;
    @FXML
    private Button calculateButton;
    @FXML
    private TextArea TextArea;
    @FXML
    private Button cbookButton;
    @FXML
    private Button goBackButton;
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        twoPeopleRB.setToggleGroup(tg);
        fourPeopleRB.setToggleGroup(tg);
        sixPeopleRB.setToggleGroup(tg);
        twoPeopleRB.setSelected(true);
    }    

    @FXML
    private void deluxRoomCheckboxOnClick(ActionEvent event) {
    }

    @FXML
    private void poolCheckboxOnClick(ActionEvent event) {
    }

    @FXML
    private void casinoCheckboxOnClick(ActionEvent event) {
    }

    @FXML
    private void gymSpaCheckboxOnClick(ActionEvent event) {
    }

    @FXML
    private void twoPeopleRBOnClick(ActionEvent event) {
    }

    @FXML
    private void fourPeopleRBOnClick(ActionEvent event) {
    }

    @FXML
    private void sixPeopleRBOnClick(ActionEvent event) {
    }

    @FXML
    private void calculateButtonOnClick(ActionEvent event) {
        
        int dlroom =0;
        int pool = 0;
        int casino = 0;
        int gymspa = 0;
        int total = 0;
        
        if(twoPeopleRB.isSelected())
        {
          if(deluxRoomCheckbox.isSelected())  
          {
              dlroom = 200;
              TextArea.appendText("Delux Room = 200\n");
           }
          if(poolCheckbox.isSelected())  
          {
              pool = 50;
              TextArea.appendText("Pool = 50\n");
           }
          if(casinoCheckbox.isSelected())  
          {
              casino = 100;
              TextArea.appendText("Casino = 100\n");
             }
           if(gymSpaCheckbox.isSelected())  
          {
              gymspa = 100;
              TextArea.appendText("GymandSpa = 100\n");    
          }
           total = dlroom+ pool+ casino+ gymspa;
           TextArea.appendText("For Two People"+Integer.toString(total));
        }
        
        
        if(fourPeopleRB.isSelected())
        {
          if(deluxRoomCheckbox.isSelected())  
          {
              dlroom = 200;
              TextArea.appendText("Delux Room = 200\n");
          }
          if(poolCheckbox.isSelected())  
          {
              pool = 50;
              TextArea.appendText("Pool = 50\n");
          }
          if(casinoCheckbox.isSelected())  
          {
              casino = 100;
              TextArea.appendText("Casino = 100\n");
          }
           if(gymSpaCheckbox.isSelected())  
          {
              gymspa = 100;
              TextArea.appendText("GymandSpa = 100\n");
          }
           total = dlroom + pool + casino + gymspa;
           TextArea.appendText("For Four People"+Integer.toString(total*2));
        }
        if(sixPeopleRB.isSelected())
        {
          if(deluxRoomCheckbox.isSelected())  
          {
              dlroom = 200;
              TextArea.appendText("Delux Room = 200\n");
          }
          if(poolCheckbox.isSelected())  
          {
              pool = 50;
              TextArea.appendText("Pool = 50\n");
          }
          if(casinoCheckbox.isSelected())  
          {
              casino = 100;
              TextArea.appendText("Casino = 100\n");
          }
           if(gymSpaCheckbox.isSelected())  
          {
              gymspa = 100;
              TextArea.appendText("GymandSpa = 100\n");
          }
           total = dlroom + pool + casino + gymspa;
           TextArea.appendText("For Six People"+Integer.toString(total*3));
        }
    }

    @FXML
    private void cbookButtonOnClick(ActionEvent event) {
        
        try {
            Parent bookParent = FXMLLoader.load(getClass().getResource("PAYMENT Details.fxml"));
            Scene book = new Scene(bookParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(book);
            window.setTitle("Payment Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMIZEPackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }
    
}
