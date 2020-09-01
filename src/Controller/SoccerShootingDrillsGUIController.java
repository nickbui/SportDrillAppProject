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
public class SoccerShootingDrillsGUIController implements Initializable {

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
       
        String a = "Penalty Kick";
        String b = "Roll Outs";
        String c = "Dribble and Shoot";
      
        String d = "Curve Shot";
        String e = "Turn and Shoot";
        list.addAll(a,b,c,d,e);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("Penalty Kick")) {
            drillDescriptionText.setText("- This drill requires one player"
                + "\n\n- Place the ball on the penalty kick spot and take 10 shots with each foot at the following locations:"
                + "\n1. Center of goals."
                + "\n2. Top right corner"
                + "\n3. Bottom right corner"
                + "\n4. Top left corner"
                + "\n5. Bottom left corner");
        } else if (drill.equals("Roll Outs")){
            drillDescriptionText.setText("- This drill requires one player"
                + "\n\n- The player starts with the ball around 25 yards away from goal. They will roll the ball about 5 yards away and take the shot while the ball is moving. Perform this drill 10-20 times with each foot."
                + "\n\n- The objective is to shoot a moving ball with power and have the shot on goal. Do not worry about placment as long as the shot is on goal.");
        } else if (drill.equals("Dribble and Shoot")) {
            drillDescriptionText.setText("- This drill requires one player"
                + "\n\n- The player starts with the ball around 30 yards away from goal. They will dribble the ball about 10 yards towards goal and and make a finesse move as if going around a defender and take the shot. Perform this drill 10-20 times with each foot."
                + "\n\n- The objective practice dribbling the ball forward before taking a shot. Additionally, manuevering around defenders is crucial to opening up shooting lanes. Do not worry about placment as long as the shot is on goal."
                + "\n\n- To increase difficulty, place an actual defender about 10 yards away at the beginning of the drill. The should put up little resistance, but will provide a larger more realistic object to go around.");
        } else if (drill.equals("Curve Shot")) {
            drillDescriptionText.setText("- This drill requires one player"
                + "\n\n- The player starts with the ball around the corner of the 18 yard box. They will roll the ball about 5 yards away and take the shot while the ball is moving. The shot should be aimed at the oppisite corner of goal from the player. Perform this drill 10-20 times from each corner of the 18 yard box."
                + "\n\n- The objective is to shoot a moving ball with power and and curve. Emphasis should be placed on placing the ball in the oppisite corner.");
        } else if (drill.equals("Turn and Shoot")) {
            drillDescriptionText.setText("- This drill requires one player."
                + "\n\n- The player starts with the ball centered on goal and around 20 yards away from goal. They will have their back placed towards the goal with the ball at their feet. The player will make a simple turn diagonally behind themselves with the ball, and take a shot on goal. Perform this drill 10-20 times with each foot."
                + "\n\n- The objective is to take a quick turn and shot on goal. Do not worry about power or placment as long as the shot is on goal.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
}
