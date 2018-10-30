package Model.Enemy;

public class Spider extends Enemy {

    public Spider(int playerLevel) {
        setArmor(75+25*playerLevel);
        setHealth(75+25*playerLevel);
        setStrength(25+25*playerLevel);
        setSpeed(0+25*playerLevel);
    }
}

