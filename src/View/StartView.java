package View;

import javafx.scene.media.*;
import java.io.File;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.StageStyle;

public class StartView {
    private Stage primaryStage;
    private AnchorPane mainLayout;

    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Another Generic Textadventure");
        this.primaryStage.initStyle(StageStyle.UNDECORATED);

        FXMLHelper.loadFXML("FXMLFiles/startScene.fxml",this.primaryStage, this.mainLayout);
        playMusic();

    }

    private void playMusic(){
        String backgroundMusic = "src/assets/sounds/Ambient/Music/Epic_Journey.mp3";

        Media sound = new Media(new File(backgroundMusic).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}

