/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zachary
 */
public class SetTimeZoneGUIController implements Initializable {

    @FXML private SplitMenuButton MenuButton;
    @FXML private Text selectTimeZoneText;
    @FXML private AnchorPane timeZoneAnchor;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    @FXML public void handleGMTSelect() {
        MenuButton.setText("Greenwich Mean Time - GMT");
    }
    
    @FXML public void handleUCTSelect() {
        MenuButton.setText("Universal Coordinated Time - GMT");
    }
     
    @FXML public void handleECTSelect() {
        MenuButton.setText("European Central Time - GMT+1:00");
    }
    
    @FXML public void handleEETSelect() {
        MenuButton.setText("Eastern European Time - GMT+2:00");
    }
    
    @FXML public void handleESTSelect() {
        MenuButton.setText("Egypt Standard Time - GMT+2:00");
    }
    
    @FXML public void handleEATSelect() {
        MenuButton.setText("Eastern African Time - GMT+3:00");
    }
     
    @FXML public void handleMETSelect() {
        MenuButton.setText("Middle East Time - GMT+3:30");
    }
    
    @FXML public void handleNETSelect() {
        MenuButton.setText("Near East Time - GMT+4:00");
    }
     
    @FXML public void handlePLTSelect() {
        MenuButton.setText("Pakistan Lahore Time - GMT+5:00");
    }
    
    @FXML public void handleISTSelect() {
        MenuButton.setText("India Standard Time - GMT+5:30");
    }
     
    @FXML public void handleBSTSelect() {
        MenuButton.setText("Bangladesh Standard Time - GMT+6:00");
    }
    
    @FXML public void handleVSTSelect() {
        MenuButton.setText("Vietnam Standard Time - GMT+7:00");
    }
    
    @FXML public void handleCTTSelect() {
        MenuButton.setText("China Taiwan Time - GMT+8:00");
    }
    
    @FXML public void handleJSTSelect() {
        MenuButton.setText("Japan Standard Time - GMT+9:00");
    }
     
    @FXML public void handleACTSelect() {
        MenuButton.setText("Australia Central Time - GMT+9:30");
    }
    
    @FXML public void handleAETSelect() {
        MenuButton.setText("Australia Eastern Time - GMT+10:00");
    }
     
    @FXML public void handleSSTSelect() {
        MenuButton.setText("Solomon Standard Time - GMT+11:00");
    }
    
    @FXML public void handleNZSTSelect() {
        MenuButton.setText("New Zealand Standard Time - GMT+12:00");
    }
     
    @FXML public void handleMITSelect() {
        MenuButton.setText("Midway Islands Time - GMT-11:00");
    }
    
    @FXML public void handleHSTSelect() {
        MenuButton.setText("Hawaii Standard Time - GMT-10:00");
    }
    
    @FXML public void handleASTSelect() {
        MenuButton.setText("Alaska Standard Time - GMT-9:00");
    }
    
    @FXML public void handlePSTSelect() {
        MenuButton.setText("Pacific Standard Time - GMT-8:00");
    }
     
    @FXML public void handlePHSTSelect() {
        MenuButton.setText("Phoenix Standard Time - GMT-7:00");
    }
    
    @FXML public void handleMSTSelect() {
        MenuButton.setText("Mountain Standard Time - GMT-7:00");
    }
     
    @FXML public void handleCSTSelect() {
        MenuButton.setText("Central Standard Time - GMT-6:00");
    }
    
    @FXML public void handleEASTSelect() {
        MenuButton.setText("Eastern Standard Time - GMT-5:00");
    }
     
    @FXML public void handleIESTSelect() {
        MenuButton.setText("Indiana Eastern Standard Time - GMT-5:00");
    }
    
    @FXML public void handlePRVISelect() {
        MenuButton.setText("Puerto Rico and US Virgin Islands Time - GMT-4:00");
    }
    
    @FXML public void handleCNTSelect() {
        MenuButton.setText("Canada Newfoundland Time - GMT-3:30");
    }
    
    @FXML public void handleARSTSelect() {
        MenuButton.setText("Argentina Standard Time - GMT-3:00");
    }
     
    @FXML public void handleBETSelect() {
        MenuButton.setText("Brazil Eastern Time - GMT-3:00");
    }
    
    @FXML public void handleCATSelect() {
        MenuButton.setText("Central African Time - GMT-1:00");
    }
     
    @FXML public void handleMenuButtonPress(ActionEvent event) throws FileNotFoundException, IOException {
        switch (MenuButton.getText()) {
            case "Time Zones":
                selectTimeZoneText.setText("Please select a time zone.");
                break;
            default:
                selectTimeZoneText.setText("");
                FxmlLoader object = new FxmlLoader();
                Pane timeZoneView = object.getPage("TimeZoneSetGUI");
                timeZoneAnchor.getChildren().clear();
                timeZoneAnchor.getChildren().addAll(timeZoneView);
                break;
        }   
    }
}
