package Controller;

import Model.Enemy.*;

public class EnemyController {

    private Enemy enemy;

    public EnemyController(){

    }

    public String[] enemyStatsString(){
        String [] enemyStats = new String[4];

        enemyStats[0] = "" + enemy.getHealth();
        enemyStats[1] = "" + enemy.getArmor();
        enemyStats[2] = "" + enemy.getStrength();
        enemyStats[3] = "" + enemy.getSpeed();

        return enemyStats;
    }

    public int[] enemyStatsInt(){
        int [] enemyStats = new int[4];

        enemyStats[0] = enemy.getHealth();
        enemyStats[1] = enemy.getArmor();
        enemyStats[2] = enemy.getStrength();
        enemyStats[3] = enemy.getSpeed();

        return enemyStats;
    }



    public void generateNewEnemy(int playerLevel){
        int enemyTypeToChoose = (int) Math.random()*4;
        if(enemyTypeToChoose == 1){
            enemy = new Spider(playerLevel);
        }
        if(enemyTypeToChoose == 2){
            enemy = new BuffedGoblin(playerLevel);
        }
        if(enemyTypeToChoose == 3){
            enemy = new GoblinArcher(playerLevel);
        }
        if(enemyTypeToChoose == 4){
            enemy = new ElderLitchy(playerLevel);
        }
    }

    public void correctEnemyHealth() {
        if (enemy.getHealth() < 0) {
            enemy.setHealth(0);
        }
    }

    public void setEnemyHealth(int currentHealth){
        enemy.setHealth(currentHealth);
    }

}
