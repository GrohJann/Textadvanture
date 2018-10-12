package Model;

public abstract class Entity {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String[] getStats() {
        String[] stats = new String[6];
        stats[0] = getName();
        stats[1] = ""+getArmor();
        stats[2] = ""+getHealth();
        stats[3] = ""+getAttack();
        return stats;
    }

}