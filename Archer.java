
public class Archer extends Unit {
	public Archer() {
		power = 20;
		defence = 20;
		health = 100;
		type = "Archer";
	}

	@Override
	public String toString() {
		return "Archer {health=" + health + ", defence=" + defence + ", power=" + power + "}";
	}
}
