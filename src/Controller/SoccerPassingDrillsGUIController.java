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
public class SoccerPassingDrillsGUIController implements Initializable {

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
       
        String a = "1 Touch Passing";
        String b = "Keep Away";
        String c = "Long Pass and Trap";
        String d = "Center Mid Passing Combo";
        String e = "Through Ball Passing";
        String f = "Crossing";
        list.addAll(a,b,c,d,e,f);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("1 Touch Passing")) {
            drillDescriptionText.setText("- This drill requires two players to line up 10 to 20 yards from each other. The two players will pass the ball back and fourth following the following pattern while changing every 5 minutes." 
                + "\n\n1. The players will trap the ball with their left foot, and pass the ball back with the right foot."
                + "\n2. The players will switch to traping the ball with their right foot and pass the ball back with the left foot."
                + "\n3. The players will pass the ball back and fourth using the right foot only with only one touch"
                + "\n4. The players will pass the ball back and fourth using the left foot only with only one touch");
        } else if(drill.equals("Keep Away")){
            drillDescriptionText.setText("- This drill requires a minimum of four players."
                + "\n\n- For every 4 players there should be 3 offensive and 1 defensive player. The offensive players form a circle around the defensive players, and try to prevent the defensive player from getting the ball."
                + "\n\n- If a defensive player steals the ball away, then he becomes an offensive player, and the offensive player that lost the ball becomes a defensive player."
                + "\n\n- As the drill progresses, you can increase the difficulty by reducing the number of touches the offensive player is allowed.");
        } else if (drill.equals("Long Pass and Trap")){
            drillDescriptionText.setText("- This drill requires two players to line up 30 to 40 yards from each other." 
                + "\n\n- The players will pass the ball through the air trying to get the ball to land as closely as possible to the other player. The player receiving the ball will attempt to trap the ball while maintaining close possessiong before passing the ball back.");
        } else if (drill.equals("Center Mid Passing Combo")) {
            drillDescriptionText.setText("- This drill requires a minimum of 5 players."
                + "\n\n- The center midfielder has two primary offensive responsibilities:"
                + "\n1. Recieving the ball from the defense to progress the ball downfield."
                + "\n2. Distribute the ball to the appropriate attacking player."
                + "\n\n- The center midfielder has far more responsibilities than those to items, but this drill focuses on receiving the ball and redistributing appropriately"
                + "\n\n- 4 players will form up in a box with the corners approximately 20 yards from each other. The center mid will be placed in the center of the box. The 4 corners will take turns passing the ball to the center mid who will pass the ball to the appropriate corner based on the location of the pass and ease of distribution."
                + "\n\n- To increase difficulty add a defender or two. This will allow the center mid to practice adjusting to defenders cutting off passing lanes.");

        } else if (drill.equals("Through Ball Passing")) {
            drillDescriptionText.setText("- This drill requires three players."
                + "\n\n- Through balls are all about timing and precision. When executed correctly they are extremely difficult to defend. However, they are very hard to perfect."
                + "\n\n- The three players will line up accordingly:"
                + "\n1. The first offensive player will line up with the ball centered on goal and around 40 yards away from the goal"
                + "\n2. The second offensive player will line up with a ball off to one side of player 1. Player 2 will be about 15 yards wide of player 1 and 35 yards away from the goal. Additionally, there will be two cones set up about 1-2 yards apart and 10 yards away from player 2 between him/her and the goal"
                + "\n3. The third player is the goalie."
                + "\n\n- The drill is ran in the following sequence:"
                + "\n1. Player one passes the ball to player two and immediately begins sprinting towards goal."
                + "\n2. Player two traps the ball, and passes the ball back to player one through the cones."
                + "\n3. Player one receives the ball and takes a shot on goal."
                + "\n\n- The objective is to prefect the timing and precesion of the pass through the cones. Player one should be receiving the ball in time with his run towards goal, and should not have to slow down/stop to receive the ball. If the pass is too early or too late, then it negates the advantage that comes with the through pass. Additionally, a pass that is too hard or too soft will have the same result.");
        } else if (drill.equals("Crossing")) {
            drillDescriptionText.setText("This drill requires a minimum of 1 player."
                + "\n\n- The player will on the wide part of the field around 20 yards from the goal line. The player will then pass the ball in front of the goal repeatedly."
                + "\n\n- The objective is to perfect the amount of air placed under the ball, and the location in which the ball drops in front of the goal.");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
}
