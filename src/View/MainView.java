package View;

import Controller.MainController;
import javafx.stage.Stage;

public class MainView {
    private Stage primaryStage;
    private StartView startView;
    private MainController mainController = new MainController();
    
    public MainView() {
        startView = new StartView();
    }

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        startView.start(primaryStage);
        this.primaryStage = primaryStage;
    }

    public void setCharacter(String character){
        if (character.equals("orc") | character.equals("mage") | character.equals("knight") | character.equals("assassin")) {
            mainController.setCharcter(character);
        } else {
            mainController.setCharcter(null);
        }
    }

    //public void setCharacter(String character) {mainController.setCharacter(character);}
}