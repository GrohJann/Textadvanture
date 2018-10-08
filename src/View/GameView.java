package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class GameView extends Application {
    private Stage primaryStage;
    private AnchorPane mainLayout;
    
    GameView(){
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Text Adventure");
        View.FXMLLoader.loadFXML("FXMLFiles/gameScene.fxml",this.primaryStage, this.mainLayout);
    }
    
    private void showGameView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GameView.class.getResource("FXMLFiles/gameScene.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }
}
