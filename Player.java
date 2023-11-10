
public class Player {
	public String name;
	private Unit unit1;
	private Unit unit2;
	private Unit unit3;
	private Unit[] units = {unit1, unit2, unit3};
	public void setUnit(int i, Unit unit) {
		units[i] = unit;
	}
	public Unit getUnit(int i) {
		return units[i];
	}
	public void setName(String name) {
		this.name = name;
	}
}
