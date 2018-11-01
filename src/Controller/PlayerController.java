package Controller;

import Model.NPC;
import Model.player_character.*;


public class PlayerController  {

  private PlayerCharacter playerCharacter;
  private NPC npc;
  private int currentLevel ;

  public PlayerController(int playerLevel){
      this.currentLevel = playerLevel;
  }

  public void createPlayerAssasin(){
      this.playerCharacter = new Assassin();
  }

    public void createPlayerKnight(){
        this.playerCharacter = new Knight();
    }

    public void createPlayerMage(){
        this.playerCharacter  =  new Mage();
    }

    public void createPlayerMeMeBIIIGBOI(){
      this.playerCharacter = new MeMeBIIIGBOI();
    }

    public String [] getStatsString(){
      String [] playerStats = new String[6];

      playerStats[0] = playerCharacter.getName();
      playerStats[1] = "" + playerCharacter.getHealth();
      playerStats[2] = "" + playerCharacter.getArmor();
      playerStats[3] = "" + playerCharacter.getStrength();
      playerStats[4] = "" + playerCharacter.getSpeed();
      playerStats[5] = "" + currentLevel;

      return playerStats;
    }

  public int [] getStatsInt(){
    int [] playerStats = new int[6];


    playerStats[0] = playerCharacter.getHealth();
    playerStats[1] = playerCharacter.getArmor();
    playerStats[2] = playerCharacter.getStrength();
    playerStats[3] = playerCharacter.getSpeed();
    playerStats[4] = currentLevel;
    playerStats[5] = npc.getLuck();

    return playerStats;
  }


    public void correctPlayerHealth(){
    if(playerCharacter.getHealth() < 0){
      playerCharacter.setHealth(0);
    }
  }

  public void setCharacterHealth(int currentHealth){playerCharacter.setHealth(currentHealth);
  }



    public void increasePlayerSats(){
      int currentHealth = playerCharacter.getHealth();
      int currentArmor = playerCharacter.getArmor();
      int currentStrength = playerCharacter.getStrength();
      int currentSpeed = playerCharacter.getSpeed();
      int currentLuck = npc.getLuck();

      playerCharacter.setHealth(currentHealth + 25);
      playerCharacter.setArmor(currentArmor + 25);
      playerCharacter.setStrength(currentStrength + 25);
      playerCharacter.setSpeed(currentSpeed + 25);
      npc.setLuck(currentLuck + 1);
      currentLevel = currentLevel +1;
    }

    public void healThroughFlee(){
      int fleeNumber = (int) Math.random()*6;
      if(fleeNumber<=5){
          int currentHealth = playerCharacter.getHealth();
          playerCharacter.setHealth(currentHealth + 50);
        }
    }

    public int getCurrentLevel(){
      return currentLevel;
    }
}
