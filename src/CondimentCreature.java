public class CondimentCreature extends Creature {
    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with the sauce! (Power: " + power + ")";
        return power;
    }
}
