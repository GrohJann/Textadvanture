package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;

public class GameView {
    private Stage primaryStage;
    private AnchorPane mainLayout;
    private static MediaPlayer mediaPlayer;
    private static String music;
    
    /**
     * plays random music
     */
    public static void playRandomMusic() {
        System.out.println("start playing music");
        int songNo = (int) (Math.random() * 5 + 1);
        
        switch (songNo) {
            case 1:
                music = "src/assets/sounds/Ambient/Music/All_This_Scoring_Action.mp3";
                break;
            case 2:
                music = "src/assets/sounds/Ambient/Music/Arcadia_Wonders.mp3";
                break;
            case 3:
                music = "src/assets/sounds/Ambient/Music/Epic_Journey.mp3";
                break;
            case 4:
                music = "src/assets/sounds/Ambient/Music/Video_Game_Soldiers.mp3";
                break;
            case 5:
                music = "src/assets/sounds/Ambient/Music/Yonder_Hill_and_Dale.mp3";
                break;
        }
        
        mediaPlayer = new MediaPlayer(new Media(new File(music).toURI().toString()));
        mediaPlayer.play();
        
        if (mediaPlayer.getStatus().equals(MediaPlayer.Status.STOPPED)) {
            playRandomMusic();
        }
    }
    
    /**
     * stops playing music
     */
    public static void stopMusic(){
        System.out.println("stop playing music");
        mediaPlayer.stop();
    }
    
    /**
     * set the volume of the music player
     */
    public static void setVolume(double volume){
        mediaPlayer.setVolume(volume/100);
    }
    
    
    /**
     * Methods that were never used, so don't worry about them
     */
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Text Adventure");
        this.primaryStage.initStyle(StageStyle.UNDECORATED);
        
        FXMLHelper.loadFXML("FXMLFiles/gameScene.fxml", this.primaryStage, this.mainLayout);
    }
    
    public void showGameView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GameView.class.getResource("FXMLFiles/gameScene.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }
}
