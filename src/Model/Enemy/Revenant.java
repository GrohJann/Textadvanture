package Model.Enemy;

public class Revenant extends Enemy {

    public Revenant(int playerLevel){
        setArmor(25+25*playerLevel);
        setHealth(75+25*playerLevel);
        setStrength(25*playerLevel);
        setSpeed(25*playerLevel);
    }
}
