public class DessertCreature extends Creature {
    private String action;

    public DessertCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = super.getName() + " attacked, causing an insulin spike! (Power: " + power + ")";
        return power;
    }
}


