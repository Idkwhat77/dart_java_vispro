public abstract class Character {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private double critRate;
    private double critDamage;

    // Constructor
    public Character(String name, int hp, int atk, int def, int spd, double critRate, double critDamage) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.critRate = critRate;
        this.critDamage = critDamage;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpd() {
        return spd;
    }

    public double getCritRate() {
        return critRate;
    }

    public double getCritDamage() {
        return critDamage;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public void setCritRate(double critRate) {
        this.critRate = critRate;
    }

    public void setCritDamage(double critDamage) {
        this.critDamage = critDamage;
    }
}