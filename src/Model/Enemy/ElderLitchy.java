package Model.Enemy;

public class ElderLitchy extends Enemy {

    public ElderLitchy(int playerLevel){
        setArmor(-25+25*playerLevel);
        setHealth(75+25*playerLevel);
        setStrength(100+25*playerLevel);
        setSpeed(25+25*playerLevel);
    }
}
