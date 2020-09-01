/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


/**
 *FXML Controller
 * 
 * @author Papa
 */
public class SetNotificationStatusGUIController implements Initializable{
    
    @FXML private SplitMenuButton menuButton;
    @FXML private Text selectNotificationStatusText;
    @FXML private AnchorPane notificationAnchor;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML public void handleNotificationOn() {
        menuButton.setText("Turn Notifications On");
    }
    
    @FXML public void handleNotificationOff() {
        menuButton.setText("Turn Notification Off");
    }
    
    
    @FXML public void handleNotificationButtonPress(ActionEvent event) throws FileNotFoundException, IOException {
        switch (menuButton.getText()) {
            case "Notification Options":
                selectNotificationStatusText.setText("Please select a Notification Option");
                break;
            default:
                selectNotificationStatusText.setText("");
                FxmlLoader object = new FxmlLoader();
                Pane languageView = object.getPage("NotificationStatusSetGUI");
                notificationAnchor.getChildren().clear();
                notificationAnchor.getChildren().addAll(languageView);
                break;
        }
        
    }
    

    
}
