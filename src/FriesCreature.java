public class FriesCreature extends Creature {
    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with oil splash! (Power: " + power + ")";
        return power;
    }

    @Override
    public void defend(float incomingPower) {
        float randFloat = Rand.randomFloat(0.0001F, 1);
    }
}
