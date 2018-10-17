package View.FXMLFiles;

import Controller.MainController;
import View.GameView;
import View.MainView;
import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class StartSceneController {
    private static MainView mainView;

    @FXML
    private AnchorPane startView;
    @FXML
    private AnchorPane rootPane;


    @FXML
    public void btnClicked() {
        System.out.println("Button clicked");
        startView.setVisible(false);

    }
    
    @FXML
    public void exit() {
        System.out.println("Exit Button clicked");
        Platform.exit();
    }
    
    @FXML
    public void showGameView() {
        System.out.println("change to GameView");
        //mainView.setCharacter("ork");
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("gameScene.fxml"));
            rootPane.getChildren().setAll(pane);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
