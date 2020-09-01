/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author nickbui
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =FXMLLoader.load(App.class.getResource("View/LoginGUI.fxml"));
        
        Scene primaryScene = new Scene(root);
        
        stage.setTitle("Welcome");
        stage.setScene(primaryScene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        Model model = new Model();
    }
    
}
