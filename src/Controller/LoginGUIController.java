package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Model;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
public class LoginGUIController {
    Model model;
    
    String userInput;
    String passInput;
    
    @FXML private Text actiontarget;
    @FXML private TextField userField;
    @FXML private TextField passwordField;
    

    @FXML public void handleSubmitButtonAction(ActionEvent event) throws IOException {
        model = new Model();
        userInput = userField.getText();
        passInput = passwordField.getText();
        if(model.getuL().authenticate(userInput, passInput)) {
            FXMLLoader loader = new FXMLLoader();
            String mainAddress = "src/View/MainMenuGUI.fxml";
            InputStream mainFxmlStream = new FileInputStream(mainAddress);
            Parent mainMenuParent = loader.load(mainFxmlStream);
            Scene mainMenuScene = new Scene(mainMenuParent);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("Main Menu");
            window.setScene(mainMenuScene);
        
        } else {
            actiontarget.setText("Failed. Please Try Again.");
        }
    }
    
}
