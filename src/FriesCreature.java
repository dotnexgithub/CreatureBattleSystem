public class FriesCreature extends Creature {
    private String action;

    public FriesCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        super.action = super.getName() + " attacked with oil splash! (Power: " + power + ")";
        return power;
    }
}

