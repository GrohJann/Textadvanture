package Controller;

import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {
    private MainView mainView;
    private String charcter;
    private EnemyController enemyController;
    private PlayerController playerController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playerController = new PlayerController(1);
        enemyController= new EnemyController();
        mainView = new MainView();
        mainView.start(primaryStage);
    }


    /**
     * Getter and Setter Methods
     */

    public void fight() {
        if (playerController.getStatsInt()[0] > 0 && enemyController.enemyStatsInt()[0] > 0) {
            if (playerController.getStatsInt()[3] >= enemyController.enemyStatsInt()[3]) {
                if ((Math.random() * 6) + playerController.getStatsInt()[5] >= 5) {
                    enemyController.setEnemyHealth(enemyController.enemyStatsInt()[0] + enemyController.enemyStatsInt()[1] - playerController.getStatsInt()[2] * 5);
                    if (enemyController.enemyStatsInt()[0] > 0) {
                        playerController.setCharacterHealth(playerController.getStatsInt()[0] + playerController.getStatsInt()[1] - enemyController.enemyStatsInt()[2]);
                        if (playerController.getStatsInt()[0] <= 0) {
                            lose();
                        }
                    } else {
                        playerController.increasePlayerSats();
                        enemyController.generateNewEnemy(playerController.getCurrentLevel());
                    }
                } else {
                    enemyController.setEnemyHealth(enemyController.enemyStatsInt()[0] + enemyController.enemyStatsInt()[1] - playerController.getStatsInt()[2]);
                    if (enemyController.enemyStatsInt()[0] > 0) {
                        playerController.setCharacterHealth(playerController.getStatsInt()[0] + playerController.getStatsInt()[1] - enemyController.enemyStatsInt()[2]);
                        if (playerController.getStatsInt()[0] <= 0) {
                            lose();
                        }
                    } else {
                        playerController.increasePlayerSats();
                        enemyController.generateNewEnemy(playerController.getCurrentLevel());
                    }
                }
            } else {
                playerController.setCharacterHealth(playerController.getStatsInt()[0] + playerController.getStatsInt()[1] - enemyController.enemyStatsInt()[2]);
                if (playerController.getStatsInt()[0] > 0) {
                    if ((Math.random() * 6) + playerController.getStatsInt()[5] >= 5) {
                        enemyController.setEnemyHealth(enemyController.enemyStatsInt()[0] + enemyController.enemyStatsInt()[1] - playerController.getStatsInt()[2] * 5);
                        if (enemyController.enemyStatsInt()[0] <= 0) {
                            playerController.increasePlayerSats();
                            enemyController.generateNewEnemy(playerController.getCurrentLevel());
                        }
                    } else {
                        enemyController.setEnemyHealth(enemyController.enemyStatsInt()[0] + enemyController.enemyStatsInt()[1] - playerController.getStatsInt()[2]);
                        if (enemyController.enemyStatsInt()[0] <= 0) {
                            playerController.increasePlayerSats();
                            enemyController.generateNewEnemy(playerController.getCurrentLevel());
                        }
                    }
                } else {
                    lose();
                }

            }
        fight();}
    }


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
        if(enemyController.enemyStatsString()[0].equals("0")){
         enemyController.generateNewEnemy(playerController.getCurrentLevel());
        }
        if(playerController.getStatsString()[1].equals(("0"))){
            lose();
        }

    }

    public void lose(){

    }
}

