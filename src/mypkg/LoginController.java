/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asif
 */
public class LoginController implements Initializable {
    @FXML
    private TextField idField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button loginBtn;
    @FXML
    private Hyperlink forgotPassField;
    @FXML
    private Hyperlink guestLink;
    @FXML
    private ComboBox loginComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginComboBox.getItems().addAll("Officer","Admin","Tour Partner");
        loginComboBox.setValue("Select"); 
    }    

    @FXML
    private void loginBtnOnClick(ActionEvent event) {
        
         File f = new File("user.txt");
        String []temp = null;
         String idTxt,passTxt;
        idTxt=idField.getText();
        passTxt=passField.getText();
        String userType=(String) loginComboBox.getValue();
        int count=0;
        if(f!=null)
        try
        {
            Scanner s = new Scanner(f);
            Scanner sc = new Scanner(f);
            
            
            while(s.hasNextLine())
            {
                temp=s.nextLine().split(" ");
            }
            
           for(int i=0;i<temp.length/4;i++)
            {
                if(userType.equals("Officer"))
                {
                    Officer e = new Officer(temp[count],temp[count+1],temp[count+2],temp[count+3]);
                        
                        if(temp[count+1].equals(idTxt)&&temp[count+3].equals(passTxt))
                        {
                            Parent officerParent = FXMLLoader.load(getClass().getResource("Officer.fxml"));
                            Scene officer = new Scene(officerParent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
                            window.setScene(officer);
                            window.setTitle("Officer Page");
                            window.show();
                            Alert alert = new Alert(AlertType.INFORMATION);
                            alert.setTitle("Hello");
                            alert.setHeaderText("Welcome "+temp[count+2]);
                             String s1 ="Logged in as: "+temp[count];
                                 alert.setContentText(s1);
                                    alert.show();
                        }         
                }
                                    count+=4;
            }
             
                                   
                                        
                                    
        }catch(FileNotFoundException fe)
        {
            System.out.println(fe);
        } catch (IOException ex) {
             Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
         
        
      /* String userType=(String) loginComboBox.getValue();
        if(userType.equals("Officer")&&temp[count+1].equals(idTxt)&&temp[count+3].equals(passTxt))
        {
           try {
            Parent officerParent = FXMLLoader.load(getClass().getResource("Officer.fxml"));
            Scene officer = new Scene(officerParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(officer);
             window.setTitle("Officer Page");
            window.show();
            Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Hello");
        alert.setHeaderText("Welcome "+temp[2]);
        String s ="Logged in as: "+temp[0];
        alert.setContentText(s);
        alert.show();
        
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } 
           
        }
        else 
        {
         Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        String s = "Enter Correct ID and Password ";
        alert.setContentText(s);
        alert.showAndWait(); 
        }*/

       
    

    @FXML
    private void forgotPassFieldOnClick(ActionEvent event) {
    }

    @FXML
    private void guestLinkOnClick(ActionEvent event) {
        try {
            Parent guestParent = FXMLLoader.load(getClass().getResource("GUEST.fxml"));
            Scene guest = new Scene(guestParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(guest);
            window.setTitle("Guest Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void loginComboBoxOnClick(ActionEvent event) {
    }
    
}
