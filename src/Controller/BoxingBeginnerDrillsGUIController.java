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
 * @author Nicholas
 */
public class BoxingBeginnerDrillsGUIController implements Initializable {

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
       
        String a = "3 Rounds Jump Rope";
        String b = "3 Rounds ShadowBox";
        String c = "3 Rounds Dynamic Stretch";
      
        String d = "3 Rounds Heavy Bag";
        String e = "3 Rounds Speed Bag";
        String f = "3 Rounds Double End Bag";
        list.addAll(a,b,c,d,e,f);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("3 Rounds Jump Rope")) {
            drillDescriptionText.setText("Jump rope for 3 rounds straight (9 minutes)");
        } else if(drill.equals("3 Rounds ShadowBox")){
            drillDescriptionText.setText("-Shadow boxing is one of the oldest, most pure, and versatile exercises for improving many aspects of your fighting ability."
                + "\n\n-The goal is not to showoff for everyone else in the gym, throwing as many punches as you can, and jerking your head back and forth. That’s a terrible goal and if anything, "
                + "only leads to you getting tired in under 5 minutes. Which is pretty sad if you’re getting tired fighting the air."
                + "\n\n-Do this exercise for three rounds(3 minutes rounds with 1 minute rest):"
                + "\n 1(jab or front hand) - 2(cross or backhand) - Slip and pivot"
                + "\n\n Remember to work on technique and footwork and not just wailing your arms around!");
        } else if (drill.equals("3 Rounds Dynamic Stretch")){
            drillDescriptionText.setText("In a swinging motion: perform each swing 6-10 times" +
                "\n\nChest and biceps – with straight arms, swing both arms backwards into a Jesus Christ pose, keeping them both straight through the swing. Start easy and build up intensity\n" +
                "Back – start in your Jesus Christ pose and swing the arms forward as if to give yourself a hug, returning back to the Christ pose. Alternate which arm is on top with each swing\n" +
                "Tricep – lift your arm straight up, as if to reach for the sky. Keep your upper arm still and swing your forearm behind your head, toward the shoulder on the same side\n" +
                "Hamstring – hold a hand out in front of you, and swing each foot individually up to your hand\n" +
                "Adductor – hold hand outstretched to the side, swinging your foot up to you hand keeping your leg as straight as possible\n" +
                "Glutes – find a wall to lean your hands up against, and bring your foot in between your body and the wall toward the opposite shoulder, with your leg at an approximate 90-degree angle.\n" +
                "Quads – one leg at a time, keep your thigh still, and bring your heel up to your glutes\n" +
                "Hip flexor – hands on the wall, start with your feet together, and individually stretch each leg straight backwards and upwards");
        } else if (drill.equals("3 Rounds Heavy Bag")) {
            drillDescriptionText.setText("Round 1 – WARM UP\n" +
                "Walk around the bag and test long shots, mainly jabs and 1-2’s. Pay attention to your stance and your defense. Keep your eyes on the whole bag. Aim well without having to focus in on one tiny spot. You should feel like you can see any attack from any angle if the bag had arms. Keep the power down at 50% and move around a lot while you establish your range."
                +"\n\nRound 1:"
                + "\n\nmaintain your boxing stance\n" +
                "establish punching range\n" +
                "use your eyes"
                +"\n\nRound 2 & 3 – POWER AND MOVEMENT" 
                +"\n\nAttack the bag with combinations as if it was a live opponent. Start putting in some power; increase your power output up to 80%. Every and now and then put in some really hard shots. If you’re going in and out of range, move in quick with sharp hooks and uppercuts and then move out quickly. Remember to use good power (technique/breathing) and good footwork (slick movements/pivots, not jumping)." 
                +"\n\ngood technique\n" +
                "sharp breathing\n" +
                "slick movement");

        } else if (drill.equals("3 Rounds Speed Bag")) {
            drillDescriptionText.setText("The first step to hitting the speed is knowing the rhythm. Just know that the speed bag will rebound 3 times for every hit. "
                + "So if it you hit it once, it will go FORWARD-BACK-FORWARD, and then come at you to be hit again. "
                + "*HIT!*, wait 3 bounces, *HIT!*, wait 3 bounces, repeat for an entire round.");
        } else if (drill.equals("3 Rounds Double End Bag")) {
            drillDescriptionText.setText("Throw some punches and block so the bag can bounce off your guard, then immediately go into a combination. You can practice your shoulder rolls too! If the bag doesn’t swing far enough to hit your guard, you can try getting closer OR you can keep track of the rhythm and continue as if it made contact."
                +"\n\nCombo:"
                +"\n\n1-2-BLOCK-2" +
                "\n1-BLOCK-1-2" +
                "\n1-2-1-2-BLOCK-2-1-2");
        } else {
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
}
