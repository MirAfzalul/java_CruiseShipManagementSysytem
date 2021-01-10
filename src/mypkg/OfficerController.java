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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class OfficerController implements Initializable {

    @FXML
    private MenuItem menuItemClose;
    @FXML
    private Button keepProtocolRecBtn;
    @FXML
    private Button keepShipRecBtn;
    @FXML
    private Button shipMtnRec;
    @FXML
    private Button checkDutyTimeBtn;
    @FXML
    private TableView<DutyTime> timeTableView;
    @FXML
    private TableColumn<DutyTime, String> idCol;
    @FXML
    private TableColumn<DutyTime, String> nameCol;
    @FXML
    private TableColumn<DutyTime, String> timeCol;
    @FXML
    private Label statusLabel;
    @FXML
    private Button logOutBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idCol.setCellValueFactory(new PropertyValueFactory<DutyTime,String>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<DutyTime,String>("name"));
        timeCol.setCellValueFactory(new PropertyValueFactory<DutyTime,String>("time"));
    }    

    @FXML
    private void menuItemCloseOnAction(ActionEvent event) {
    }

    @FXML
    private void keepProtocolRecBtnOnClick(ActionEvent event) throws IOException {
        Parent protocolParent = FXMLLoader.load(getClass().getResource("PROTOCOL.fxml"));
        Scene protocol = new Scene(protocolParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Protocol");
        window.setScene(protocol);
        window.show();
    }

    @FXML
    private void keepShipRecBtnOnClick(ActionEvent event) {
    }

    @FXML
    private void shipMtnRecOnClick(ActionEvent event) {
    }

    @FXML
    private void checkDutyTimeBtnOnClick(ActionEvent event) {
         
        File f = new File("dutyTime.txt");
        String []temp = null;
        if(f!=null)
        try
        {
            Scanner s = new Scanner(f);
            Scanner sc = new Scanner(f);
            int count=0;
            while(s.hasNextLine())
            {
                temp=s.nextLine().split(" ");
            }
            
           for(int i=0;i<temp.length/3;i++)
            {
               DutyTime e = new DutyTime(temp[count],temp[count+1],temp[count+2]);
                        count+=3;
                        timeTableView.getItems().add(e);
            }
            
        }catch(FileNotFoundException fe)
        {
            System.out.println(fe);
        }
        String s="showing duty time \n last update thursday.";
        statusLabel.setText(s);
    }
    

    @FXML
    private void logOutBtnOnClick(ActionEvent event) {
        
    }
    
    
}
