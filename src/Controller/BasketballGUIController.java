/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author papa
 */
public class BasketballGUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
   @FXML 
     BorderPane bp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   @FXML
   public void dribblingDrillsButton(ActionEvent e) {
       FxmlLoader beginObject = new FxmlLoader();
       Pane beginView = beginObject.getPage("BasketballDribblingDrillsGUI");
       bp.setCenter(beginView);
   }
   @FXML
   public void shootingDrillsButton(ActionEvent e) {
       FxmlLoader footworkObject = new FxmlLoader();
       Pane footworkView = footworkObject.getPage("BasketballShootingDrillsGUI");
       bp.setCenter(footworkView);
   }
   @FXML
   public void defenseDrillsButton(ActionEvent e) {
       FxmlLoader handSpeedObject = new FxmlLoader();
       Pane handSpeedView = handSpeedObject.getPage("BasketballDefenseDrillsGUI");
       bp.setCenter(handSpeedView);
   }
   
   
}

