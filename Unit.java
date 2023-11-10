public class Unit {
    protected int health;
    protected int defence;
    protected int power;
    protected String type;
    
    Unit(){}
    
    public int getHealth(){
        return health;
    }

    public int getDefence() {
        return defence;
    }
    public int getPower() {
        return power;
    }
    
    public String getType() {
		return type;
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


    public void attack(Unit unit){
        unit.getDamage((int)(power*CCR.CriticalHit()));
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
        this.health-=(CCR.parry((int)(damage - damage*defence*0.01)));
    }
}
