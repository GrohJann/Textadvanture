package Model.Enemy;

public class BuffedGoblin extends Enemy {

    public BuffedGoblin(int playerLevel){
        setArmor(0+25*playerLevel);
        setHealth(100+25*playerLevel);
        setStrength(75+25*playerLevel);
        setSpeed(25+25*playerLevel);
    }
}
