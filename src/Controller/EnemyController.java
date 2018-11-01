package Controller;

import Model.Enemy.*;

public class EnemyController {

    private Enemy enemy;

    public EnemyController(){

    }

    /**
     * Returns enemy stats in a String array
     * @return
     */

    public String[] enemyStatsString(){
        String [] enemyStats = new String[4];

        enemyStats[0] = "" + enemy.getHealth();
        enemyStats[1] = "" + enemy.getArmor();
        enemyStats[2] = "" + enemy.getStrength();
        enemyStats[3] = "" + enemy.getSpeed();

        return enemyStats;
    }

    /**
     * Returns enemy stats in an int array
     * @return
     */

    public int[] enemyStatsInt(){
        int [] enemyStats = new int[4];

        enemyStats[0] = enemy.getHealth();
        enemyStats[1] = enemy.getArmor();
        enemyStats[2] = enemy.getStrength();
        enemyStats[3] = enemy.getSpeed();

        return enemyStats;
    }

    /**
     * Generates a randomly chosen enemy with stats suited for the current player level
     * @param playerLevel
     */



    public void generateNewEnemy(int playerLevel){
        int enemyTypeToChoose = (int) (Math.random()*4)+1;
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

    /**
     * Sets the enemy health to a certain value
     * @param currentHealth
     */

    public void setEnemyHealth(int currentHealth){
        enemy.setHealth(currentHealth);
    }

}
