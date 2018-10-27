package Controller;

import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {
    private MainView mainView;
    private String charcter;
    private EnemyController enemyController;
    private

    private PlayerController playerController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playerController = new PlayerController(1);
        currentEnemy = new EnemyController();
        mainView = new MainView();
        mainView.start(primaryStage);
    }


    /**
     * Getter and Setter Methods
     */
    public void setCharcter(String charcter) {
        this.charcter = charcter;
    }

    public void flee() {
        int fleeNumber = (int) Math.random() * 6;
        if (fleeNumber >= 5) {
            playerController.healThroughFlee();
            enemyController.generateNewEnemy(playerController.getCurrentLevel());
        }
    }

    public String getCharcterPic() {
        return charcter;
    }


    public void update() {
        playerController.correctPlayerHealth();
        enemyController.correctEnemyHealth();
        if(enemyController.enemyStats()[0].equals("0")){
         enemyController.generateNewEnemy(playerController.getCurrentLevel());
        }
        if(playerController.getStats()[1].equals(("0")){
            lose();
        }

    }

    public void lose(){

    }
}

