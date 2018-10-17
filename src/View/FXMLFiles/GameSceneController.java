package View.FXMLFiles;

import View.MainView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.util.ResourceBundle;

public class GameSceneController implements Initializable {
    private static MainView mainView;
    @FXML
    private AnchorPane options;

    @FXML
    private Pane characterPane;

    @FXML
    private Pane audioPane;

    @FXML
    private ImageView avatar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        options.setVisible(false);
        //avatar.setImage(mainView.getAvatarPic());
    }

    @FXML
    public void exit() {
        System.out.println("Exit Button clicked");
        Platform.exit();
    }

    @FXML
    public void openOptions(){
        options.setVisible(true);
    }

    @FXML
    public void closeOptions(){
        options.setVisible(false);
    }

    @FXML
    public void showAudio(){
        characterPane.setVisible(false);
        audioPane.setVisible(true);
    }

    @FXML
    public void showCharacter(){
        audioPane.setVisible(false);
        characterPane.setVisible(true);
    }

}
