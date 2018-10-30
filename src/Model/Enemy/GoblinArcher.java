package Model.Enemy;

public class GoblinArcher extends Enemy {

    public GoblinArcher(int playerLevel){
        setArmor(-25+25*playerLevel);
        setHealth(75+25*playerLevel);
        setStrength(50+25*playerLevel);
        setSpeed(50+25*playerLevel);
    }
}
