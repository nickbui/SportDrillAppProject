
package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nickbui
 */
public class SettingGUIController{
    @FXML private AnchorPane settingAnchor;
    
    @FXML public void handleMenuThemeButtonAction(ActionEvent event){
            FxmlLoader object = new FxmlLoader();
            Pane menuThemeView = object.getPage("MenuThemeGUI");
            settingAnchor.getChildren().clear();
            settingAnchor.getChildren().addAll(menuThemeView);
    }
    
    @FXML public void handleSetTimeZoneButton(ActionEvent event) throws FileNotFoundException, IOException {
            FxmlLoader object = new FxmlLoader();
            Pane timeZoneView = object.getPage("SetTimeZoneGUI");
            settingAnchor.getChildren().clear();
            settingAnchor.getChildren().addAll(timeZoneView);
    }
    
    
    @FXML public void handleSetNotificationStatusButton(ActionEvent event) throws FileNotFoundException, IOException {
            FxmlLoader object = new FxmlLoader();
            Pane notificationView = object.getPage("SetNotificationStatusGUI");
            settingAnchor.getChildren().clear();
            settingAnchor.getChildren().addAll(notificationView);
    }
    
    @FXML public void handleSetLanguageButton(ActionEvent event) throws FileNotFoundException, IOException {
            FxmlLoader object = new FxmlLoader();
            Pane languageView = object.getPage("SetLanguageGUI");
            settingAnchor.getChildren().clear();
            settingAnchor.getChildren().addAll(languageView);
  
    }

}