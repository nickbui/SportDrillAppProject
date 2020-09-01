
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
 * @author zachary
 */
public class SoccerGUIController implements Initializable {

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
   public void passingDrillsButton(ActionEvent e) {
       FxmlLoader beginObject = new FxmlLoader();
       Pane beginView = beginObject.getPage("SoccerPassingDrillsGUI");
       bp.setCenter(beginView);
   }
   @FXML
   public void shootingDrillsButton(ActionEvent e) {
       FxmlLoader footworkObject = new FxmlLoader();
       Pane footworkView = footworkObject.getPage("SoccerShootingDrillsGUI");
       bp.setCenter(footworkView);
   }
   @FXML
   public void defenseDrillsButton(ActionEvent e) {
       FxmlLoader handSpeedObject = new FxmlLoader();
       Pane handSpeedView = handSpeedObject.getPage("SoccerDefenseDrillsGUI");
       bp.setCenter(handSpeedView);
   }
   
   
}