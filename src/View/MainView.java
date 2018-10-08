package View;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainView extends Application {
    private StartView startView;
    private GameView gameView;
    
    public MainView() {
        startView = new StartView();
        gameView = new GameView();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        startView.start(primaryStage);
    }
}