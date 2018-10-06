package Controller;

import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {
    private MainView mainView;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        mainView = new MainView();
        mainView.start(primaryStage);
    }
}
