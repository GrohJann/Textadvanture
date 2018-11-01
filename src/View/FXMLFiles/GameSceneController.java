package View.FXMLFiles;

import Controller.MainController;
import View.GameView;
import View.MainView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
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

    @FXML
    private Pane MageOptions;

    @FXML
    private Pane OrcOptions;

    @FXML
    private Pane AssassinOptions;

    @FXML
    private Pane KnightOptions;
    
    @FXML
    private ProgressBar health;
    
    @FXML
    private CheckBox musicBtn;
    
    /**
     *this Method runs directly after/while loading the affiliated View
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        options.setVisible(false);
        if (musicBtn.isSelected()){
            GameView.playRandomMusic();
        }
        if (MainView.getCharacter().equals("orc")) {
            MageAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);

            MageOptions.setVisible(false);
            AssassinOptions.setVisible(false);
            KnightOptions.setVisible(false);
        }
        if (MainView.getCharacter().equals("mage")) {
            OrcAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);

            OrcOptions.setVisible(false);
            AssassinOptions.setVisible(false);
            KnightOptions.setVisible(false);
        }
        if (MainView.getCharacter().equals("assassin")) {
            MageAvatar.setVisible(false);
            OrcAvatar.setVisible(false);
            KinghtAvatar.setVisible(false);

            MageOptions.setVisible(false);
            OrcOptions.setVisible(false);
            KnightOptions.setVisible(false);
        }
        if (MainView.getCharacter().equals("knight")) {
            MageAvatar.setVisible(false);
            AssassinAvatar.setVisible(false);
            OrcAvatar.setVisible(false);

            MageOptions.setVisible(false);
            AssassinOptions.setVisible(false);
            OrcOptions.setVisible(false);
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
        System.out.println("options opened");
    }

    @FXML
    public void closeOptions(){
        options.setVisible(false);
        System.out.println("options closed");
    }

    @FXML
    public void showAudio(){
        characterPane.setVisible(false);
        audioPane.setVisible(true);
        System.out.println("audio showing");
    }

    @FXML
    public void showCharacter(){
        audioPane.setVisible(false);
        characterPane.setVisible(true);
        System.out.println("character showing");
    }

    @FXML
    public void fleePressed(){
        System.out.println("Flee Button clicked");
        MainController.flee();
    }
    
    @FXML
    public void fightPressed(){
        System.out.println("Fight Button clicked");
        MainView.fight();
    }
    
    @FXML
    public void music(){
        if (musicBtn.isSelected()){
            GameView.playRandomMusic();
        } else {
            GameView.stopMusic();
        }
    }
}
