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
public class BasketballDefenseDrillsGUIController implements Initializable{
    
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
       
        String a = "One-on-One Continuous";
        String b = "Pass Denial";
        String c = "Defending the Dribble Drill";
        list.addAll(a,b,c);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("One-on-One Continuous")) {
            drillDescriptionText.setText("- This drill must be done with atleast 2 players. " 
             + "\n\n- This drill requires your players to form a line at the top of the key and fill the wing spots. One offensive and one defensive player start playing one-on-one from the wing. Once there is a score, or the defense player takes possession, the top line passes to the opposite wing and then fills the free wing. The offensive player from the previous game immediately closes out, and they play compete until a score or change of possession. This process of the offensive player immediately transitioning to defending the opposite wing continues for the however long you have determined the drill should last.");
        } else if(drill.equals("Pass Denial")){
            drillDescriptionText.setText("- This drill must be done with atleast 2 players. " 
             + "\n\n-  This drill involves two players competing one-on-one from the wing. The offensive player walks the defender in and explodes out looking to receive the pass from the other player in the slot. The defender tries to deny the pass to the offensive player. Every time the offensive player catches the basketball, they will pass it back to the players in the slot, and the drill will continue. After the third catch, the two players switch positions.");
        } else if (drill.equals("Defending the Dribble Drill")){
            drillDescriptionText.setText("- This drill must be done with atleast 2 players. " 
             + "\n\n- This defensive drill has the goal of the player taking the ball as hard as they can to the basket while the defensive player tries to defend the dribble for eight seconds. This typically creates quite the battle between the two players. If the offensive player can get through, instead of shooting, the player will take the ball back out again.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
        
    
}
