
public class Knight extends Unit{
	Knight(){
		power = 15;
		health = 100;
		defence = 25;
		type = "Knight";
	}

	@Override
	public String toString() {
		return "Knight {health=" + health + ", defence=" + defence + ", power=" + power + "}";
	}
	
}
