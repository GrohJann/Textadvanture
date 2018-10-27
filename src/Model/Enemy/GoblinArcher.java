package Model.Enemy;

public class GoblinArcher extends Enemy {

    public GoblinArcher(int playerLevel){
        setArmor(-25+25*playerLevel);
        setHealth(50+25*playerLevel);
        setStrength(115+25*playerLevel);
        setSpeed(0+25*playerLevel);
    }
}
