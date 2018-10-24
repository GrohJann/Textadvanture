package Controller;

import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {
    private MainView mainView;

    private String charcter;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        mainView = new MainView();
        mainView.start(primaryStage);
    }


    /**
     * Getter and Setter Methods
     */
    public void setCharcter(String charcter) {
        this.charcter = charcter;
    }

    public String getCharcterPic() {
        return charcter;
    }
}
