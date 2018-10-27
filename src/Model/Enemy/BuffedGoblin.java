package Model.Enemy;

public class BuffedGoblin extends Enemy {

    public BuffedGoblin(int playerLevel){
        setArmor(75+25*playerLevel);
        setHealth(85+25*playerLevel);
        setStrength(+25*playerLevel);
        setSpeed(-5+25*playerLevel);
    }
}
