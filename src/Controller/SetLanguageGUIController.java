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
 *
 * @author saakshigundecha
 */
public class SetLanguageGUIController implements Initializable {
    
    @FXML private SplitMenuButton MenuButton;
    @FXML private Text selectLanguageText;
    @FXML private AnchorPane languageAnchor;
    
    // English, German, Spanish, French, Korean, Japanese
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML public void handleEngSelect() {
        MenuButton.setText("English");
    }
    
    @FXML public void handleGerSelect() {
        MenuButton.setText("German");
    }
     
    @FXML public void handleFerSelect() {
        MenuButton.setText("French");
    }
    
    @FXML public void handleSpanSelect() {
        MenuButton.setText("Spanish");
    }
    
    @FXML public void handleAraSelect() {
        MenuButton.setText("Arabic");
    }
    
    @FXML public void handleKorSelect() {
        MenuButton.setText("Korean");
    }
    
    @FXML public void handleJapSelect() {
        MenuButton.setText("Japanese");
    }
    
    @FXML public void handleMenuButtonPress(ActionEvent event) throws FileNotFoundException, IOException {
        switch (MenuButton.getText()) {
            case "Languages":
                selectLanguageText.setText("Please select a Language.");
                break;
            default:
                selectLanguageText.setText("");
                FxmlLoader object = new FxmlLoader();
                Pane languageView = object.getPage("LanguageSetGUI");
                languageAnchor.getChildren().clear();
                languageAnchor.getChildren().addAll(languageView);
                break;
        }
        
    }
    
}
