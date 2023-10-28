

public class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit("Roma");
        Unit unit2 = new Unit("Maks");

//        unit1.attack(unit2);
//        System.out.println(unit1);
//        System.out.println(unit2);

        Wizard wiz = new Wizard("w1");
        Wizard wiz1 = new Wizard("w2");
        wiz.attack(wiz1);
        System.out.println(wiz);
        System.out.println(wiz1);
        System.out.println(game.CountOfPlayers);
    }
}
