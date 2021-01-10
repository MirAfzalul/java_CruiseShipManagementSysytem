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
import java.time.LocalDate;
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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class CANCELPackageController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private Button showPackageButton;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void showPackageButtonOnClick(ActionEvent event) {

         String []st=null;
       int count=0;
        try {
            File f=new File("Payment.txt");
            Scanner s =new Scanner(f);
            while(s.hasNextLine())
            {
                st=s.nextLine().split(",");
            }
           for(int i=0;i<st.length/6;i++)
            {
               // Payment pm = new Payment(st[count],st[count+1],st[count+2],Integer.parseInt(st[count+3]),Integer.parseInt(st[count+4]),LocalDate.parse(st[count+5]));
                
            
            System.out.println(st[count]);
            System.out.println(st[count+1]);
            if(nameField.getText().equals(st[count]) && emailField.getText().equals(st[count+1]))
            {
                
            }
            else
            {
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Error");
                            alert.setHeaderText("Name Email didn't Match");
                             String s1 ="";
                                 alert.setContentText(s1);
                                    alert.show();
            }
          count+=6;
          }
          
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(STANDARDPackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
