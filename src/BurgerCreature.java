public class BurgerCreature extends Creature {
    private String action;

    public BurgerCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = super.getName() + " attacked with patties! (Power: " + power + ")";
        return power;
    }
}


