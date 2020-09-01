/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;



/**
 * FXML Controller class
 *
 * @author nickbui
 */
public class SportController implements Initializable {

    @FXML private ChoiceBox sportBox;
    @FXML private AnchorPane sportAnchor;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        sportBox.getItems().add("Basketball");
        sportBox.getItems().add("Boxing");
        sportBox.getItems().add("Cricket");
        sportBox.getItems().add("Soccer");
        
        sportBox.setValue("Basketball");
    }

    
    @FXML
    public void handleSelectButtonAction(ActionEvent event) {
         switch (sportBox.getValue().toString()) {
            case "Basketball":
                FxmlLoader basketballObject = new FxmlLoader();
                Pane basketballView = basketballObject.getPage("BasketballGUI");
                sportAnchor.getChildren().clear();
                sportAnchor.getChildren().addAll(basketballView);
                break;
            case "Cricket":
                FxmlLoader cricketObject = new FxmlLoader();
                Pane cricketView = cricketObject.getPage("CricketGUI");
                sportAnchor.getChildren().clear();
                sportAnchor.getChildren().addAll(cricketView);
                break;
            case "Boxing":
                FxmlLoader boxingObject = new FxmlLoader();
                Pane boxingView = boxingObject.getPage("boxingGUI");
                sportAnchor.getChildren().clear();
                sportAnchor.getChildren().addAll(boxingView);
                break;
            case "Soccer":
                FxmlLoader soccerObject = new FxmlLoader();
                Pane soccerView = soccerObject.getPage("SoccerGUI");
                sportAnchor.getChildren().clear();
                sportAnchor.getChildren().addAll(soccerView);
                break;
            default:
                break;
        }
    }
    
}
