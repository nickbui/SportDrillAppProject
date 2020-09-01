/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author nickbui
 */
public class MainMenuGUIController  {

    @FXML 
     BorderPane bp;
    @FXML
     Label navText;
    @FXML Button sprtsBttn;
    /**
     * Initializes the controller class.
     */
   
    @FXML public void handleSportButtonAction(ActionEvent event) {
            FxmlLoader object = new FxmlLoader();
            Pane view = object.getPage("SportGUI");
            bp.setCenter(view);
            navText.setText("Sport");
    }
    
    @FXML public void handleMessageButtonAction(ActionEvent event) {
            FxmlLoader object = new FxmlLoader();
            Pane view = object.getPage("MessageGUI");
            bp.setCenter(view);
            navText.setText("Message");
   }
    
    @FXML public void handleCalendarButtonAction(ActionEvent event) {
            FxmlLoader object = new FxmlLoader();
            Pane view = object.getPage("CalendarGUI");
            bp.setCenter(view);
            navText.setText("Calender");
   }
  
    @FXML public void handleSettingButtonAction(ActionEvent event) {
            FxmlLoader object = new FxmlLoader();
            Pane view = object.getPage("SettingGUI");
            bp.setCenter(view);
            navText.setText("Setting");
   }
}
