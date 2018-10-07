package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameView extends Application {
    
    GameView(){
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gameScene.fxml"));
        primaryStage.setTitle("Textadventure");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    
    public void runButtonClicked(){
    
    }
    
    public void fleeButtonClicked(){
    
    }
    
    public void fightButtonClicked(){
    
    }
}
