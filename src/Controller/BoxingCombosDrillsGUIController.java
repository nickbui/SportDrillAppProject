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
public class BoxingCombosDrillsGUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    ObservableList list =FXCollections.observableArrayList();
    
    @FXML
    private ListView<String> drillNameList;
    
    @FXML
    private Text drillDescriptionText;
    
    @FXML
    private Text boxingMapText;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData();
    }    
    
    private void loadData() {
        list.removeAll(list);
        String a = "Basic Jab";
        String b = "Double Jab";
        String c = "Triple Jab";
        String d = "Jab, Right Cross";
        String e = "Left Hook";
        String f = "Left-Right Left-Right";
        String g = "Tricky Combos";
        String h = "Uppercuts";
        String i ="Long Combos";
        list.addAll(a,b,c,d,e,f,g,h,i);
        drillNameList.getItems().addAll(list);
    }
    
    @FXML
    private void displaySelected(MouseEvent event){
        String drill = drillNameList.getSelectionModel().getSelectedItem();
        if(drill.equals("Basic Jab")){
            drillDescriptionText.setText(" 1, move around, 1\n" +
                "1, back step, 1\n" +
                "1, step in, 1");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Double Jab")){
            drillDescriptionText.setText("1-1\n" +
                "1-1 (step in twice)");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Triple Jab")){
            drillDescriptionText.setText("1-1-1");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Jab, Right Cross")){
            drillDescriptionText.setText("1-2\n" +
                "1-1-2\n" +
                "1-2-1\n" +
                "1-2-1-2\n" +
                "1-2-1-1");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Left Hook")){
            drillDescriptionText.setText("1-2-3\n" +
                "1-2-3-2");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Left-Right Left-Right")){
            drillDescriptionText.setText("1-2-3-2-1\n" +
                "1-2-1-2-3\n" +
                "2-3-2\n" +
                "2-3-2-1\n" +
                "2-3-2-1-2");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Tricky Combos")){
            drillDescriptionText.setText("1-3\n" +
                "1-1-3\n" +
                "1-3-2\n" +
                "1-2-3-3-2\n" +
                "1-3-1-2\n" +
                "1-2-3-1-2\n" +
                "5-6-2\n" +
                "5-1-2-3-2\n" +
                "1-6-2-1-2");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Uppercuts")){
            drillDescriptionText.setText("1-6\n" +
                "1-6-3-2\n" +
                "3-6-3-2\n" +
                "1-2-5\n" +
                "1-2-5-2");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else if(drill.equals("Long Combos")){
            drillDescriptionText.setText("6-5-6-5-2-3-2\n" +
                "1-2-5-2-3-6-3-2\n" +
                "1-1-2-3-6-3-2\n" +
                "5-2-1-6-3-2-1-2");
            boxingMapText.setText("Here are the punch numbers:\n" +
                "\n" +
                "1 = left jab\n" +
                "2 = straight right / right cross\n" +
                "3 = left hook\n" +
                "4 = right hook / overhand right\n" +
                "5 = left uppercut\n" +
                "6 = right uppercut\n" +
                "*reverse these if you are southpaw (left-handed)");
        }else{
            drillDescriptionText.setText("Click on a Drill and the description will be displayed here!");
        }
    }
}
