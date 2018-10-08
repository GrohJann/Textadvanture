package View.FXMLFiles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StartSceneController {
    @FXML private ImageView startBtn;
    
    
    @FXML
    public void btnClicked(Event e){
        startBtn.setImage(new Image("file:assets/pictures/gui_pics/Button/BtnClicked.png"));
        System.out.println("Button clicked");
    }
}
