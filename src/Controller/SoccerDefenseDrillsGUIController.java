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
 * @author zachary
 */
public class SoccerDefenseDrillsGUIController implements Initializable {

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
       
        String a = "Close Down";
        String b = "3 v 3 Corner Kicks";
        String c = "3 v 2 Defending";
        String d = "Recovery Run";
        list.addAll(a,b,c,d);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("Close Down")) {
            drillDescriptionText.setText("- This drill requires 3 players. 1 offense, 1 defense, and 1 goalie."
                + "\n\n- The offensive player lines up around 20 yards away from goal. The defensive player lines up with the ball next to one of the goal posts."
                + "\n\n- The defensive player passes the ball to the offensive player and tries to close down the offensive player before they gets the shot off. If he gets there in time, then the defender tries to win and clear the ball while the offensive player attempts to get a clean shot on goals.");
        } else if(drill.equals("3 v 3 Corner Kicks")){
            drillDescriptionText.setText("- This drill requires 8 players. 3 offense, 3 defense, 1 goalie, and 1 player to kick the corner kick."
                + "\n\n- The three defenders attempt to defend a corner kick against three attackers."
                + "\n\n- Defenders should focus on winning the ball in the air, and clearing as quickly as possible."
                + "\n\n- To increase difficulty, reduce the number of defenders to two, and play the next ball immediately after the previous ball is either shot or cleared. This drill should be ran from each corner.");
        } else if (drill.equals("3 v 2 Defending")){
            drillDescriptionText.setText("- This drill requires 6 players. 3 offense, 2 defense, and 1 goalie."
                + "\n\n- This drill simulates an offensive breakaway where the defenders have to hold off the attack until more defenders can get back. Emphasis should be placed on offensive players pushing the ball forward and getting a shot off quickly."
                + "\n\n- Defenders will need to maintain positioning and look for good opportunities to press the attackers. Discipline and positioning are key for defenders in this situation. The goal of the defenders is to stall the attack, or to win the ball back from the attackers.");
        } else if (drill.equals("Recovery Run")) {
            drillDescriptionText.setText("- This drill requires 4 player. 1 offense, 1 defense, 1 goalie, and 1 passer."
                + "\n\n This drill simulates a defending successful through balls. The players will line up as follows:"
                + "\n1. The goalie will be in goal."
                + "\n2. The attacker will line up 40 yards away from goal off to one side of the goal."
                + "\n3. The defender will line up 40 yards away from goal and centered on the goal."
                + "\n4. The passer will line up next to the defender."
                + "\n\n- The passer will pass the ball towards goal while trying to lead the pass towards the attacker. The defender will have to outsprint the attacker to prevent a 1 v 1 attacker versus goalie opportunity."
                + "\n\n- The objective is to focus on closing speed and angle of attack. Since the defender is centered on goal he will have less distance to cover, but has no time to spare.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
}
