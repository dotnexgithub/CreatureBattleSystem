public class Main {
    public static void main(String[] args) {

        // set up the creatures
        BurgerCreature a = new BurgerCreature("burgir", 100);
        CondimentCreature b = new CondimentCreature("Ketchup", 100);
        DessertCreature c = new DessertCreature("Hot Fudge Sundae", 100);
        FriesCreature d = new FriesCreature("Golden Arches", 100);

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battleFFA(a, b, c, d);
    }
}
