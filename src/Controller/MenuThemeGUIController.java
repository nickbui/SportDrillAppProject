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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Nicholas
 */
public class MenuThemeGUIController{
    private boolean theme = true;
    

 @FXML public void lightThemeButton(ActionEvent event) throws IOException {
     this.setTheme(true);
    
 }
 
 @FXML public void darkThemeButton(ActionEvent event) throws FileNotFoundException, IOException {
      this.setTheme(false);
 }
 
@FXML public void handleMainMenuButton(ActionEvent event) throws FileNotFoundException, IOException {
        if(theme == true) {
            FXMLLoader loader = new FXMLLoader();
            String address = "src/View/MainMenuGUI.fxml";
            InputStream fxmlStream = new FileInputStream(address);
            Parent mainMenuParent = loader.load(fxmlStream);
            Scene mainMenuScene = new Scene(mainMenuParent);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            mainMenuScene.getStylesheets().remove("View/dark-theme.css");
            window.setTitle("Main Menu");
            window.setScene(mainMenuScene);
            this.setTheme(true);
        }else {
            FXMLLoader loader = new FXMLLoader();
            String address = "src/View/MainMenuGUI.fxml";
            InputStream fxmlStream = new FileInputStream(address);
            Parent mainMenuParent = loader.load(fxmlStream);
            Scene mainMenuScene = new Scene(mainMenuParent);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            mainMenuScene.getStylesheets().add("View/dark-theme.css");
            window.setTitle("Main Menu");
            window.setScene(mainMenuScene);
            this.setTheme(false);
        }
    }

    /**
     * @return the theme
     */
    public boolean isTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(boolean theme) {
        this.theme = theme;
    }

    
}
