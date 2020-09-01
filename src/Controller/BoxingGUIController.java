
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
 * @author nickbui
 */
public class BoxingGUIController implements Initializable {

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
   public void BeginnerDrillsButton(ActionEvent e) {
       FxmlLoader beginObject = new FxmlLoader();
       Pane beginView = beginObject.getPage("BoxingBeginnerDrillsGUI");
       bp.setCenter(beginView);
   }
   @FXML
   public void footworkDrillsButton(ActionEvent e) {
       FxmlLoader footworkObject = new FxmlLoader();
       Pane footworkView = footworkObject.getPage("BoxingFootworkDrillsGUI");
       bp.setCenter(footworkView);
   }
   @FXML
   public void comboDrillsButton(ActionEvent e) {
       FxmlLoader handSpeedObject = new FxmlLoader();
       Pane handSpeedView = handSpeedObject.getPage("BoxingCombosDrillsGUI");
       bp.setCenter(handSpeedView);
   }
   
   
}