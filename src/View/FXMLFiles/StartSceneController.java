package View.FXMLFiles;

import View.MainView;
import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartSceneController {
    private MainView mainView;

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
    
    /**
     * sets the chosen character as chosen
     * loads GameView into the PrimaryStage
     * @param event MouseClick
     */
    @FXML
    public void showGameView(MouseEvent event) {
        System.out.println("change to GameView");
        Button btn = (Button) event.getSource();
        System.out.println("source: "+ btn);
        String id = btn.getId();

        if (id.equals("orcBtn")) {
            System.out.println("set orc");
            mainView.setCharacter("orc");
        }
        if (id.equals("mageBtn")) {
            System.out.println("set mage");
            mainView.setCharacter("mage");
        }
        if (id.equals("assassinBtn")) {
            System.out.println("set assassin");
            mainView.setCharacter("assassin");
        }
        if (id.equals("knightBtn")) {
            System.out.println("set knight");
            mainView.setCharacter("knight");
        }

        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("gameScene.fxml"));
            rootPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
