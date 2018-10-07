package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartView extends Application {
    private Button button;
    private StackPane layout;
    private Scene scene;
    
    private Stage primaryStage;
    
    StartView(){
        button = new Button();
        layout = new StackPane();
        scene =new Scene(layout, 500,500);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Adventure");
        button.setText("Start Game");
        
        layout.getChildren().add(button);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Button getButton(){
        return button;
    }
}

