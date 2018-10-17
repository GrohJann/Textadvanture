package View;

import Controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Application {
    private Stage primaryStage;
    private StartView startView;
    private MainController mainController = new MainController();
    
    public MainView() {
        startView = new StartView();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        startView.start(primaryStage);
        this.primaryStage = primaryStage;
    }
    
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(
                getClass().getResource(fxml));
        
        Scene scene = new Scene( pane );
        primaryStage.setScene(scene);
    }

    public Image getAvatarPic(){
        return mainController.getAvatarPic();
    }

    public void setCharacter(String character) {
        mainController.setCharacter(character);
    }
}