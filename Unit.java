public class Unit {
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float CriticalChance = 0.1f;
    protected float ParryChance = 0.1f;

    protected String name = "Vova";

    public Unit(String name){
        this.name = name;
        game.CountOfPlayers++;
    }
    public Unit(){}

    public int getHealth(){
        return health;
    }

    public int getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public float getCriticalChance() {
        return CriticalChance;
    }

    public float getParryChance() {
        return ParryChance;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCriticalChance(float criticalChance) {
        CriticalChance = criticalChance;
    }

    public void setParryChance(float parryChance) {
        ParryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public void getDamage(int damage){
        this.health-=damage;
    }

}
