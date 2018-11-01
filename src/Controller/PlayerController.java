package Controller;

import Model.NPC;
import Model.player_character.*;


public class PlayerController {


    
    private PlayerCharacter playerCharacter;
    private NPC npc;
    private int currentLevel;
    private String character;
    private int playerChosen;
    private int maxHealth;
    
    
    public PlayerController(int playerLevel) {
        this.currentLevel = playerLevel;
    }

    /**
     * Creates an Assassin
     */
    public void createPlayerAssasin() {
        this.playerCharacter = new Assassin();
        this.npc = new NPC();
        npc.setLuck(4);
        character = "assassin";
        playerChosen = 1;
    }

    /**
     * Creates a Knight
     */

    public void createPlayerKnight() {
        this.playerCharacter = new Knight();
        this.npc = new NPC();
        npc.setLuck(1);
        character = "knight";
        playerChosen = 2;
    }

    /**
     * Creates a Mage
     */

    public void createPlayerMage() {
        this.playerCharacter = new Mage();
        this.npc = new NPC();
        npc.setLuck(1);
        character = "mage";
        playerChosen = 3;
    }

    /**
     * Creates the MEMEBIGBOYYYYYYYYYY
     */

    public void createPlayerMeMeBIIIGBOI() {
        this.playerCharacter = new MeMeBIIIGBOI();
        this.npc = new NPC();
        npc.setLuck(1);
        character = "orc";
        playerChosen = 4;
    }

    /**
     *
     */
    
    public void increasePlayerStats() {
        int currentHealth = playerCharacter.getHealth();
        int currentArmor = playerCharacter.getArmor();
        int currentStrength = playerCharacter.getStrength();
        int currentSpeed = playerCharacter.getSpeed();
        
        playerCharacter.setHealth(currentHealth + 25);
        playerCharacter.setArmor(currentArmor + 25);
        playerCharacter.setStrength(currentStrength + 25);
        playerCharacter.setSpeed(currentSpeed + 25);
        currentLevel = currentLevel + 1;
    }
    
    public void healThroughFlee() {
        int fleeNumber = (int) Math.random() * 6;
        if (fleeNumber <= 5) {
            int currentHealth = playerCharacter.getHealth();
            playerCharacter.setHealth(currentHealth + 50);
        }
    }
    
    
    /**
     * Getter and Setter Methods
     */
    public String[] getStatsString() {
        String[] playerStats = new String[6];
        
        playerStats[0] = playerCharacter.getName();
        playerStats[1] = "" + playerCharacter.getHealth();
        playerStats[2] = "" + playerCharacter.getArmor();
        playerStats[3] = "" + playerCharacter.getStrength();
        playerStats[4] = "" + playerCharacter.getSpeed();
        playerStats[5] = "" + currentLevel;
        
        return playerStats;
    }
    
    public int[] getStatsInt() {
        int[] playerStats = new int[7];
        
        
        playerStats[0] = playerCharacter.getHealth();
        playerStats[1] = playerCharacter.getArmor();
        playerStats[2] = playerCharacter.getStrength();
        playerStats[3] = playerCharacter.getSpeed();
        playerStats[4] = currentLevel;
        playerStats[5] = npc.getLuck();
        if(playerChosen == 1){
            maxHealth = 75 + 25 * currentLevel;
            playerStats[6] = maxHealth;
        }
        if(playerChosen == 2){
            maxHealth = 75 + 25 * currentLevel + 50;
            playerStats[6] = maxHealth;
        }
        if(playerChosen == 1){
            maxHealth = 75 + 25 * currentLevel + 50;
            playerStats[6] = maxHealth;
        }
        if(playerChosen == 3){
            maxHealth = 50 + 25 * currentLevel + 50;
            playerStats[6] = maxHealth;
        }
        if(playerChosen == 4){
            maxHealth = 100 + 25 * currentLevel + 50;
            playerStats[6] = maxHealth;
        }

        
        return playerStats;
    }
    
    public int getCurrentLevel() {
        return currentLevel;
    }
    
    public void setCharacterHealth(int currentHealth) {
        playerCharacter.setHealth(currentHealth);
    }
    
    public String getCharacter() {
        return character;
    }
    
}
