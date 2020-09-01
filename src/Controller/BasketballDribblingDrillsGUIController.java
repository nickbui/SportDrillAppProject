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
public class BasketballDribblingDrillsGUIController implements Initializable{
    
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
       
        String a = "Ball Slaps";
        String b = "Spider Dribble";
        String c = "Drops";
        list.addAll(a,b,c);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("Ball Slaps")) {
            drillDescriptionText.setText("- This drill can be done alone. " 
                   + "\n\n- Continuously slap the basketball from one hand to the other. This is a great drill to start with to get your hands ready for the workout.");
        } else if(drill.equals("Spider Dribble")){
            drillDescriptionText.setText("- This drill can be done alone. "
                + " \n\n- Start with your knees shoulder width apart and bent. The ball should stay underneath you the entire time of the drill. Dribble the ball with your right hand, then your left hand, then reach your right hand around behind your knee for a dribble, and then your left hand behind your knee for a dribble, and then back to your right hand in front. Continue this." );
        } else if (drill.equals("Drops")){
            drillDescriptionText.setText("- This drill can be done alone." 
                + "\n\n- Start in a squat position with both hands and the basketball in front of you. The aim is to drop the ball between your legs (only a few inches off the ground), let it bounce once, then take both hands behind your legs before catching it. Then dropping the ball again from behind and taking both hands back to the front and catch it. Repeat.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
           
}
