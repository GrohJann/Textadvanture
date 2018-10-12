package View.FXMLFiles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.application.Platform;
import javafx.scene.layout.AnchorPane;

import java.awt.*;


public class StartSceneController {
    @FXML
    private AnchorPane startView;


    @FXML
    public void btnClicked() {
        System.out.println("Button clicked");
        startView.setVisible(false);

    }
    
    @FXML
    public void exit(Event e) {
        System.out.println("Exit Button clicked");
        Platform.exit();
    }
}
