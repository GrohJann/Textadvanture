package Controller;

import Model.player_character.*;


public class PlayerController  {

  private PlayerCharacter playerCharacter;
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

    public String [] getStats(){
      String [] playerStats = new String[6];

      playerStats[0] = playerCharacter.getName();
      playerStats[1] = "" + playerCharacter.getHealth();
      playerStats[2] = "" + playerCharacter.getArmor();
      playerStats[3] = "" + playerCharacter.getStrength();
      playerStats[4] = "" + playerCharacter.getSpeed();
      playerStats[5] = "" + currentLevel;

      return playerStats;
    }

    public void correctPlayerHealth(){
    if(playerCharacter.getHealth() < 0){
      playerCharacter.setHealth(0);
    }
    }

    public void increasePlayerSats(){
      int currentHealth = playerCharacter.getHealth();
      int currentArmor = playerCharacter.getArmor();
      int currentStrength = playerCharacter.getStrength();
      int currentSpeed = playerCharacter.getSpeed();

      playerCharacter.setHealth(currentHealth + 25);
      playerCharacter.setArmor(currentArmor + 25);
      playerCharacter.setStrength(currentStrength + 25);
      playerCharacter.setSpeed(currentSpeed + 25);

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
