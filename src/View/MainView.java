package View;

import Controller.MainController;
import View.FXMLFiles.GameSceneController;
import javafx.stage.Stage;

public class MainView {
    private Stage primaryStage;
    private StartView startView;
    
    public MainView() {
        startView = new StartView();
    }
    
    /**
     * Starts showing the StartView
     * @param primaryStage Stage for showing the View (similar to JFrame in Java.swing)
     * @throws Exception shows error when something is wrong inside the View
     */
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        startView.start(primaryStage);
        this.primaryStage = primaryStage;
    }
    
    public static void fight(){
        MainController.fight();
    }
    
    public static void flee(){
        MainController.flee();
    }
    
    public static void showLoosePane(){
        GameSceneController.showLoosePane();
    }
    
    
    /**
     * Getter and Setter Methods
     */
    public static void setCharacter(String character){
        if (character.equals("orc") | character.equals("mage") | character.equals("knight") | character.equals("assassin")) {
            MainController.setCharacter(character);
        } else {
            MainController.setCharacter(null);
        }
    }
    
    public static String getCharacter() {return MainController.getCharacter();}
    
    public static void setHealth(double health){
        GameSceneController.setHealth(health);
    }
}