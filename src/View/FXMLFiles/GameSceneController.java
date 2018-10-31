package View.FXMLFiles;

import View.MainView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.File;
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
    private ImageView MageAvatar;

    @FXML
    private ImageView OrcAvatar;

    @FXML
    private ImageView AssassinAvatar;

    @FXML
    private ImageView KinghtAvatar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        options.setVisible(false);
        if (MainView.getCharacter().equals("orc")) {
            MageAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);
        }
        if (MainView.getCharacter().equals("mage")) {
            OrcAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);
        }
        if (MainView.getCharacter().equals("assassin")) {
            MageAvatar.setVisible(false);
            OrcAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);
        }
        if (MainView.getCharacter().equals("knight")) {
            MageAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            OrcAvatar.setVisible(false);
        }
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
