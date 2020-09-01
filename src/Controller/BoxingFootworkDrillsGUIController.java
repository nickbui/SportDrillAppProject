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
public class BoxingFootworkDrillsGUIController implements Initializable {

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
        String a = "Blocking from static position";
        String b = "Jump Rope";
        String c = "Step-drag(in Inches)";
        String d = "Small pivots";
        String e = "Relaxed Shaodwboxing";
        list.addAll(a,b,c,d,e);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
            if(drill.equals("Blocking from static position")){
                drillDescriptionText.setText("So simple and yet so amusingly challenging for even the more athletic and “experienced” fighters. It tests your #1 most basic footwork ability, which is not your ability to move but rather “the ability to NOT move”. Before you can even punch, block, or move with balance/control, you need to have a rock-solid stance! This little drill reveals whether or not you know how to stand properly.\n" +
                    "\n" +
                    "How to practice static-blocking:\n" +
                    "\n" +
                    "Stand in your boxing stance. Relaxed, calm, breathing, fists unclenched.\n" +
                    "Have someone throw one punch at a time. (Start with an open-hand slap to your shoulders from both sides, and then lower to the elbows.) You’d be surprised how many people tip over off balance at this point.\n" +
                    "Then have them throw more realistic punches. Straight jabs/crosses, hooks, uppercuts, both to the head and body and you have to block all of them.\n" +
                    "Don’t go crazy…it’s not a defense drill. Throw these punches one at a time. Start with one every 5 seconds. Once you get comfortable, can be one every 3 seconds and you can even reposition and reset yourself as if you’re in a live fight.\n" +
                    "Once you’re comfortable to just blocking from your neutral stance, do the harder version: throw any punch but hold that arm out and have your assistant slap you anywhere on your body. (Shoulder, arm, etc).\n" +
                    "The goal is test your balance, not your defense! Have them throw at obvious places and fully telegraphing so you can where the shot is going.");
            } else if(drill.equals("Jump Rope")){
                drillDescriptionText.setText("Jump rope develops your efficiency more than anything and without developing a basic level of efficiency, coordination, and rhythm within your body, you won’t be a very effective boxer at all. Literally every movement you make will take more energy and make you so tired that you won’t get to do as much in the ring.\n" +
                    "\n" +
                    "How to jump rope:\n" +
                    "\n" +
                    "Get a jump rope\n" +
                    "Jump for 15 minutes straight (no breaks)\n" +
                    "Getting tired or keep tripping? It doesn’t matter, just reset and keep going until the time is up.\n" +
                    "Do this everyday, until it’s super super easy.\n" +
                    "Tips for the skipping rope:\n" +
                    "\n" +
                    "Breathe out of your nose.\n" +
                    "Don’t worry about being good. Just focus on keeping your body moving (and not taking breaks).\n" +
                    "Use a proper-length rope and don’t jump too high.");
            } else if(drill.equals("Step-drag(in Inches)")){
                drillDescriptionText.setText("It’s the basic footwork drill that all coaches make beginners do to keep their feet on the ground. The nuance here is that I want you to focus only on moving a few inches at a time. Think like 2-3 inches.\n" +
                    "\n" +
                    "How to practice the step-drag:\n" +
                    "\n" +
                    "Step with one foot (a few inches) in any direction, and then reset the other foot quickly to recover your boxing stance on the new position.\n" +
                    "Reach with your toes with the stepping foot. And push off with your toes on the dragging foot. (The common problem is when fighters rock back off their front heel when going back.)\n" +
                    "Be quick but RELAXED (not too explosive or too stiff).\n" +
                    "Resist the urge to step far, that’s not the point of this drill!\n" +
                    "Don’t jump! Keep your weight down.");
            } else if(drill.equals("Small pivots")){
                drillDescriptionText.setText("You’re going to practice doing small pivots, swinging the back leg in both directions (clockwise and counter-clockwise). And you’re going to do it SLOWER, and VERY RELAXED!\n" +
                    "\n" +
                    "Again, this is one of those simple drills that beginners can’t help but turn it into something else. You show them a simple pivot one minute, and next thing you know they’re jumping around and trying to do fancy stance-switches. Cut that out and do it right, so you develop the right skill with this!\n" +
                    "\n" +
                    "How to practice small-pivots:\n" +
                    "\n" +
                    "Stand relaxed and start with really small pivots (only 10-15 degrees) at a time.\n" +
                    "Mix it up with the step-drags. Move linear sometimes, then throw in a pivot.\n" +
                    "Here and there, you throw in a bigger pivot…like 45-90 degrees.\n" +
                    "Practice doing it super relaxed and arriving into a perfect solid stance.\n" +
                    "Now practice throw punches RIGHT after you pivot. This is where that relaxed stability really matters. Many fighters try to move too quick or too far, and they end up taking too long to re-stabilize for throwing punches.");
            } else if(drill.equals("Relaxed Shaodwboxing")){
                drillDescriptionText.setText("Ok, now time to combine everything you just learned.\n" +
                    "\n" +
                    "Solid stance (and being able to block without getting pushed back off balance).\n" +
                    "Jump rope coordination and endurance.\n" +
                    "Small drag-steps.\n" +
                    "Small Pivots.\n" +
                    "Do it all while shadowboxing. A couple quick foot movements here and there. Mix in some punches. Mix in some head movements.\n" +
                    "\n\n" +
                    "PRACTICE FLOW-TRANSITIONS\n" +
                    "\n" +
                    "Try to flow from one movement to the next.\n" +
                    "Using the momentum of your punches, head movement, and footwork to transition back and forth between all of them.\n" +
                    "Make it all fluid! AND SMOOTH!\n" +
                    "This is to develop your smooth fighting style; lots of finesse and calmness.\n" +
                    "PRACTICE STOP-TRANSITIONS\n" +
                    "\n" +
                    "Then also try making a clear separate movements. Basically adding a very quick “stop” after every movement.\n" +
                    "Like a step, then a very slightly momentary pause, and then a punch.\n" +
                    "Basically like a fidget/herky-jerky style BUT CLEAN!\n" +
                    "This is to develop your quick-feint fighting style; lots of suddenness and quick directional changes.");
            } else {
                drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
            }
    }
}
