package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends Application {
    private Button button;
    
    public MainView() {
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Adventure");
        button = new Button();
        button.setText("Start Game");
    
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
    
        Scene scene =new Scene(layout, 500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}