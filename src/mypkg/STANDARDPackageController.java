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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class STANDARDPackageController implements Initializable {

    @FXML
    private Button bookButton;
    @FXML
    private Button backButton;
    @FXML
    private TableView<Package> tableView;
    @FXML
    private TableColumn<Package, String> itemColumn;
    @FXML
    private TableColumn<Package, String> pricecolumn;
    @FXML
    private Button showDetailButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         itemColumn.setCellValueFactory(new PropertyValueFactory<Package,String>("item"));
     pricecolumn.setCellValueFactory(new PropertyValueFactory<Package,String>("price"));
    }    

    @FXML
    private void bookButtonOnCLick(ActionEvent event) {
        try {
            Parent bookParent = FXMLLoader.load(getClass().getResource("PAYMENT Details.fxml"));
            Scene book = new Scene(bookParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(book);
            window.setTitle("Payment Page");
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(STANDARDPackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showDetailButtonOnClick(ActionEvent event) {
         String []st=null;
       int count=0;
        try {
            File f=new File("package.txt");
            Scanner s =new Scanner(f);
            while(s.hasNextLine())
            {
                st=s.nextLine().split(" ");
            }
            for(int i=0;i<st.length/2;i++)
            {
                Package pk = new Package(st[count],st[count+1]);
                count+=2;
                tableView.getItems().add(pk);
            }
    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(STANDARDPackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}