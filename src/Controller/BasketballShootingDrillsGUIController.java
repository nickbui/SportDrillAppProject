/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Papa
 */
public class BasketballShootingDrillsGUIController implements Initializable {
    
     /**
     * Initializes the controller class.
     */
    ObservableList list =FXCollections.observableArrayList();
    
    @FXML
    private ListView<String> drillNameList;
    
    @FXML
    private Text drillDescriptionText;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData();
    }    
    
    private void loadData() {
        list.removeAll(list);
       
        String a = "Spin Outs";
        String b = "One Hand Form Shooting";
        String c = "Add Guide Hand";
        list.addAll(a,b,c);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("Spin Outs")) {
            drillDescriptionText.setText("- This drill can be done alone. "
            + "\n\n- You simply spin the ball out away from you backspin. Then you sprint to the ball and grab it, turn and face the basket, then shoot.\n" 
            + "\n" + "You can do a variety of straight cuts and curl cuts. You can do corner to wing cuts, wing to top cuts, post to perimeter cuts, perimeter to post cuts, high post to low post cuts, low post to high post cuts, fast break cuts from half court, and so on.");
        } else if(drill.equals("One Hand Form Shooting")){
            drillDescriptionText.setText("- This drill can be done alone. " 
            + "\n\n- Stand 2 to 4 feet in front of the rim. Position your feet properly and line up to shoot. Bring your arm up into an L position. Your upper arm is parallel to the ground and your forearm is pointing to the ceiling. Your upper arm and forearm are at about a 75 to 90 degree angle. Shoot 5 to 10 reps then move to a new spot.");
        } else if (drill.equals("Add Guide Hand")){
            drillDescriptionText.setText("- This drill can be done alone. " 
            + "\n\n- Stand 2 to 4 feet in front of the rim. Position your feet properly and line up to shoot. Bring your arm up into an L position. Your upper arm is parallel to the ground and your forearm is pointing to the ceiling. Your upper arm and forearm are at about a 75 to 90 degree angle. Place your guide hand on the ball. Shoot 5 to 10 reps then move to a new spot.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
    
    
}
