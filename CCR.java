import java.util.Random;

public class CCR {
	public static int parry(int damage) {
		Random r = new Random();
		int result = r.nextInt(100)+1;
		if(result <= 15) { //15% chance to parry
			return 0;
		}else {
			return damage;
		}
	}
	public static float CriticalHit() {
		Random r = new Random();
		int result = r.nextInt(100)+1;
		if(result <= 20) { //20% chance to make a CriticalHit
			return 1.5f;
		}else {
			return 1.0f;
		}
	}
}
