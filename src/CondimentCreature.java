public class CondimentCreature extends Creature {
    private String action;

    public CondimentCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = super.getName() + " attacked with the sauce! (Power: " + power + ")";
        return power;
    }
}


