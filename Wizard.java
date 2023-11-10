
public class Wizard extends Unit{

    protected int mana = 40;

    public Wizard(){
        defence = 15;
        health = 100;
        power = 10;
        type = "Wizard";
    }

    @Override
    public void attack(Unit unit) {
    	if(mana>40) mana = 40;
        if(mana>10) {
            power = 30;
            mana-=10;
        }
        else {
        	power = 10;
        	mana+=3;
        }
        mana+=2;
        super.attack(unit);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                ", mana=" + mana +
                '}';
    }
}
