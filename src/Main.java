public class Main {
    public static void main(String[] args) {

        // set up the creatures
        BurgerCreature a = new BurgerCreature();
        CondimentCreature b = new CondimentCreature();
        DessertCreature c = new DessertCreature();
        FriesCreature d = new FriesCreature();
        a.name = "burgir";
        a.health = 100;
        b.name = "Ketchup";
        b.health = 100;
        c.name = "Hot Fudge Sundae";
        c.health = 100;
        d.name = "Golden Arches";
        d.health = 100;

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battleFFA(a, b, c, d);
    }
}
